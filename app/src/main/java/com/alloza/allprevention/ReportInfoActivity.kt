package com.alloza.allprevention

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_report_info.*

class ReportInfoActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_info)

        val theKey = intent.getStringExtra("clave")
        title = theKey

        if (theKey != null) {
            db.collection("informes").document(theKey).get().addOnSuccessListener {
                medidaPrev1TextView.text = it.get("opcion01") as String?
                medidaPrev2TextView.text = it.get("opcion02") as String?
                medidaPrev3TextView.text = it.get("opcion03") as String?
                medidaPrev4TextView.text = it.get("opcion04") as String?
                medidaPrev5TextView.text = it.get("opcion05") as String?
                medidaPrev6TextView.text = it.get("opcion06") as String?
                medidaPrev7TextView.text = it.get("opcion07") as String?
                medidaPrev8TextView.text = it.get("opcion08") as String?
                medidaPrev9TextView.text = it.get("opcion09") as String?
                medidaPrev10TextView.text = it.get("opcion10") as String?
                medidaPrev11TextView.text = it.get("opcion11") as String?
                medidaPrev12TextView.text = it.get("opcion12") as String?
                medidaPrev13TextView.text = it.get("opcion13") as String?
                medidaPrev14TextView.text = it.get("opcion14") as String?
                medidaPrev15TextView.text = it.get("opcion15") as String?
                medidaPrev16TextView.text = it.get("opcion16") as String?
                medidaPrev17TextView.text = it.get("opcion17") as String?
                medidaPrev18TextView.text = it.get("opcion18") as String?
                medidaPrev19TextView.text = it.get("opcion19") as String?
                medidaPrev20TextView.text = it.get("opcion20") as String?
                medidaPrev21TextView.text = it.get("opcion21") as String?
                medidaPrev22TextView.text = it.get("opcion22") as String?
                medidaPrev23TextView.text = it.get("opcion23") as String?
                medidaPrev24TextView.text = it.get("opcion24") as String?
                medidaPrev25TextView.text = it.get("opcion25") as String?
                medidaPrev26TextView.text = it.get("opcion26") as String?
                medidaPrev27TextView.text = it.get("opcion27") as String?
                medidaPrev28TextView.text = it.get("opcion28") as String?
                medidaPrev29TextView.text = it.get("opcion29") as String?
                medidaPrev30TextView.text = it.get("opcion30") as String?
                medidaPrev31TextView.text = it.get("opcion31") as String?
                medidaPrev32TextView.text = it.get("opcion32") as String?
                medidaPrev33TextView.text = it.get("opcion33") as String?
                medidaPrev34TextView.text = it.get("opcion34") as String?
                medidaPrev35TextView.text = it.get("opcion35") as String?
                medidaPrev36TextView.text = it.get("opcion36") as String?
            }
        }
        backToMyEvalsButton.setOnClickListener {

            val intent = Intent(this,MyReportsActivity::class.java)
            startActivity(intent)
        }
    }


}