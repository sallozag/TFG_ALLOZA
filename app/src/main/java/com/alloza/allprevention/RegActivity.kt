package com.alloza.allprevention

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_reg.*

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        title = "Registro"
        setup()

        backAccButton.setOnClickListener {

            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setup() {

        signUpButton.setOnClickListener {
            if (emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty()) {
                if (passwordEditText.text.length >= 6) {

                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                        emailEditText.text.toString(),
                        passwordEditText.text.toString())
                        .addOnCompleteListener {

                            if (it.isSuccessful) {
                                val text = "Su cuenta ha sido registrada con éxito."
                                val duration = Toast.LENGTH_LONG

                                val toast = Toast.makeText(applicationContext, text, duration)
                                toast.show()
                                val intent = Intent(this,AuthActivity::class.java)
                                startActivity(intent)
                            } else {
                                showAlertSignUp()
                            }
                        }
                } else {
                    showBadPassAlert()
                }
            } else {
                showUserPassAlert()
            }
        }
    }

    private fun showAlertSignUp() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("El correo electrónico introducido no existe o ya está registrado en PVD Prevención")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showUserPassAlert() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Por favor, introduzca los campos de usuario y contraseña.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showBadPassAlert() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Por favor, introduzca una contraseña de seis o más caracteres.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

}

