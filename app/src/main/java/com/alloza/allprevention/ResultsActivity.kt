package com.alloza.allprevention

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_results.*
import java.text.SimpleDateFormat
import java.util.*

class ResultsActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        //Setup
        val bundle: Bundle? = intent.extras
        val opcion1 = bundle?.getString("opcion1")
        val opcion2 = bundle?.getString("opcion2")
        val opcion3 = bundle?.getString("opcion3")
        val opcion4 = bundle?.getString("opcion4")
        val opcion5 = bundle?.getString("opcion5")
        val opcion6 = bundle?.getString("opcion6")
        val opcion7 = bundle?.getString("opcion7")
        val opcion8 = bundle?.getString("opcion8")
        val opcion9 = bundle?.getString("opcion9")
        val opcion10 = bundle?.getString("opcion10")
        val opcion11 = bundle?.getString("opcion11")
        val opcion12 = bundle?.getString("opcion12")
        val opcion13 = bundle?.getString("opcion13")
        val opcion14 = bundle?.getString("opcion14")
        val opcion15 = bundle?.getString("opcion15")
        val opcion16 = bundle?.getString("opcion16")
        val opcion17 = bundle?.getString("opcion17")
        val opcion18 = bundle?.getString("opcion18")
        val opcion19 = bundle?.getString("opcion19")
        val opcion20 = bundle?.getString("opcion20")
        val opcion21 = bundle?.getString("opcion21")
        val opcion22 = bundle?.getString("opcion22")
        val opcion23 = bundle?.getString("opcion23")
        val opcion24 = bundle?.getString("opcion24")
        val opcion25 = bundle?.getString("opcion25")
        val opcion26 = bundle?.getString("opcion26")
        val opcion27 = bundle?.getString("opcion27")
        val opcion28 = bundle?.getString("opcion28")
        val opcion29 = bundle?.getString("opcion29")
        val opcion30 = bundle?.getString("opcion30")
        val opcion31 = bundle?.getString("opcion31")
        val opcion32 = bundle?.getString("opcion32")
        val opcion33 = bundle?.getString("opcion33")
        val opcion34 = bundle?.getString("opcion34")
        val opcion35 = bundle?.getString("opcion35")
        val opcion36 = bundle?.getString("opcion36")
        setup(opcion1?: "", opcion2?:"", opcion3?:"", opcion4?:"",
            opcion5?: "", opcion6?:"", opcion7?:"", opcion8?:"",
            opcion9?: "", opcion10?:"", opcion11?:"", opcion12?:"",
            opcion13?: "", opcion14?:"", opcion15?:"", opcion16?:"",
            opcion17?: "", opcion18?:"", opcion19?:"", opcion20?:"",
            opcion21?: "", opcion22?:"", opcion23?:"", opcion24?:"",
            opcion25?: "", opcion26?:"", opcion27?:"", opcion28?:"",
            opcion29?: "", opcion30?:"", opcion31?:"", opcion32?:"",
            opcion33?: "", opcion34?:"", opcion35?:"", opcion36?:"",)

        val prefs = getSharedPreferences(getString(R.string.prefs_file2), Context.MODE_PRIVATE).edit()
        prefs.putString("opcion1", opcion1)
        prefs.putString("opcion2", opcion2)
        prefs.putString("opcion3", opcion3)
        prefs.putString("opcion4", opcion4)
        prefs.putString("opcion5", opcion5)
        prefs.putString("opcion6", opcion6)
        prefs.putString("opcion7", opcion7)
        prefs.putString("opcion8", opcion8)
        prefs.putString("opcion9", opcion9)
        prefs.putString("opcion10", opcion10)
        prefs.putString("opcion11", opcion11)
        prefs.putString("opcion12", opcion12)
        prefs.putString("opcion13", opcion13)
        prefs.putString("opcion14", opcion14)
        prefs.putString("opcion15", opcion15)
        prefs.putString("opcion16", opcion16)
        prefs.putString("opcion17", opcion17)
        prefs.putString("opcion18", opcion18)
        prefs.putString("opcion19", opcion19)
        prefs.putString("opcion20", opcion20)
        prefs.putString("opcion21", opcion22)
        prefs.putString("opcion23", opcion23)
        prefs.putString("opcion24", opcion24)
        prefs.putString("opcion25", opcion25)
        prefs.putString("opcion26", opcion26)
        prefs.putString("opcion27", opcion27)
        prefs.putString("opcion28", opcion28)
        prefs.putString("opcion29", opcion29)
        prefs.putString("opcion30", opcion30)
        prefs.putString("opcion30", opcion30)
        prefs.putString("opcion31", opcion31)
        prefs.putString("opcion32", opcion32)
        prefs.putString("opcion33", opcion33)
        prefs.putString("opcion34", opcion34)
        prefs.putString("opcion35", opcion35)
        prefs.putString("opcion36", opcion36)
        prefs.apply()

        title = "Resultados"

        val backAccButton = findViewById<Button>(R.id.backAccButton)
        backAccButton.setOnClickListener {

            val intent = Intent(this,HomeActivity::class.java)
            val prefs6 = getSharedPreferences(getString(R.string.prefs_file2), Context.MODE_PRIVATE).edit()
            prefs6.clear()
            prefs6.apply()
            startActivity(intent)
        }

        saveEvaluationButton.setOnClickListener {

            if (nombreInforme.text.isNotEmpty()) {

                val email: String? = FirebaseAuth.getInstance().currentUser?.email
                val fecha: String? = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                    .format(System.currentTimeMillis())

                db.collection("informes").document(nombreInforme.text.toString()).set(
                    hashMapOf("id" to nombreInforme.text.toString(),
                        "email" to email,"fecha" to fecha, "opcion01" to opcion1, "opcion02" to opcion2,
                        "opcion03" to opcion3, "opcion04" to opcion4, "opcion05" to opcion5,
                        "opcion06" to opcion6, "opcion07" to opcion7, "opcion08" to opcion8,
                        "opcion09" to opcion9, "opcion10" to opcion10, "opcion11" to opcion11,
                        "opcion12" to opcion12, "opcion13" to opcion13, "opcion14" to opcion14,
                        "opcion15" to opcion15, "opcion16" to opcion16, "opcion17" to opcion17,
                        "opcion18" to opcion18, "opcion19" to opcion19, "opcion20" to opcion20,
                        "opcion21" to opcion21, "opcion22" to opcion22, "opcion23" to opcion23,
                        "opcion24" to opcion24, "opcion25" to opcion25, "opcion26" to opcion26,
                        "opcion27" to opcion27, "opcion28" to opcion28, "opcion29" to opcion29,
                        "opcion30" to opcion30, "opcion31" to opcion31, "opcion32" to opcion32,
                        "opcion33" to opcion33, "opcion34" to opcion34, "opcion35" to opcion35,
                        "opcion36" to opcion36)
                )
                showOK()
            } else {
                showNotOK()
            }
        }
    }

    private fun setup(opcion1: String, opcion2: String, opcion3: String, opcion4: String,
                      opcion5: String, opcion6: String, opcion7: String, opcion8: String,
                      opcion9: String, opcion10: String, opcion11: String, opcion12: String,
                      opcion13: String, opcion14: String, opcion15: String, opcion16: String,
                      opcion17: String, opcion18: String, opcion19: String, opcion20: String,
                      opcion21: String, opcion22: String, opcion23: String, opcion24: String,
                      opcion25: String, opcion26: String, opcion27: String, opcion28: String,
                      opcion29: String, opcion30: String, opcion31: String, opcion32: String,
                      opcion33: String, opcion34: String, opcion35: String, opcion36: String,) {

        medidaPrev1TextView.text = opcion1
        medidaPrev2TextView.text = opcion2
        medidaPrev3TextView.text = opcion3
        medidaPrev4TextView.text = opcion4
        medidaPrev5TextView.text = opcion5
        medidaPrev6TextView.text = opcion6
        medidaPrev7TextView.text = opcion7
        medidaPrev8TextView.text = opcion8
        medidaPrev9TextView.text = opcion9
        medidaPrev10TextView.text = opcion10
        medidaPrev11TextView.text = opcion11
        medidaPrev12TextView.text = opcion12
        medidaPrev13TextView.text = opcion13
        medidaPrev14TextView.text = opcion14
        medidaPrev15TextView.text = opcion15
        medidaPrev16TextView.text = opcion16
        medidaPrev17TextView.text = opcion17
        medidaPrev18TextView.text = opcion18
        medidaPrev19TextView.text = opcion19
        medidaPrev20TextView.text = opcion20
        medidaPrev21TextView.text = opcion21
        medidaPrev22TextView.text = opcion22
        medidaPrev23TextView.text = opcion23
        medidaPrev24TextView.text = opcion24
        medidaPrev25TextView.text = opcion25
        medidaPrev26TextView.text = opcion26
        medidaPrev27TextView.text = opcion27
        medidaPrev28TextView.text = opcion28
        medidaPrev29TextView.text = opcion29
        medidaPrev30TextView.text = opcion30
        medidaPrev31TextView.text = opcion31
        medidaPrev32TextView.text = opcion32
        medidaPrev33TextView.text = opcion33
        medidaPrev34TextView.text = opcion34
        medidaPrev35TextView.text = opcion35
        medidaPrev36TextView.text = opcion36
    }

    private fun showOK() {

        val builder = AlertDialog.Builder(this)
        builder.setMessage("Se ha guardado la evaluación correctamente. Para visualizarla, vaya a Mis Evaluaciones.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.setOnDismissListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        dialog.show()
    }

    private fun showNotOK() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Por favor, introduzca un nombre para su evaluación.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

}