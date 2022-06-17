package com.alloza.allprevention

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*

enum class ProviderType{
    BASIC, GOOGLE
}

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Setup
        val bundle: Bundle? = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")
        setup()

        // Guardado de datos al salir de la app

        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
        prefs.putString("email", email)
        prefs.putString("provider", provider)
        prefs.apply()

    }

    private fun setup() {

        title = "Menú principal"

        logOutButton.setOnClickListener {

            //Borrado de datos
            val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
            prefs.clear()
            prefs.apply()

            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this,AuthActivity::class.java)
            startActivity(intent)
        }

        performEvButton.setOnClickListener {

            val intent = Intent(this,ChecklistActivity::class.java)
            startActivity(intent)
        }

        myEvsButton.setOnClickListener {

            val intent = Intent(this,MyReportsActivity::class.java)
            startActivity(intent)
        }

        helpButton.setOnClickListener {
            val intent = Intent(this,HelpActivity::class.java)
            startActivity(intent)
        }

        faqButton.setOnClickListener {

            val intent = Intent(this,FaqActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {

    }
}
