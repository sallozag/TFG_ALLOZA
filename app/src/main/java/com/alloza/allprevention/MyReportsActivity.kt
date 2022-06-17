package com.alloza.allprevention

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.Settings
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.itextpdf.text.Document
import com.itextpdf.text.Paragraph
import com.itextpdf.text.pdf.PdfWriter
import kotlinx.android.synthetic.main.activity_my_reports.*
import java.io.FileOutputStream

class MyReportsActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_reports)

        if (!Environment.isExternalStorageManager()) {
            val intent = Intent(Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION)
            startActivity(intent)
        }

        title = "Mis evaluaciones"

        val email: String? = FirebaseAuth.getInstance().currentUser?.email
        db.collection("informes").whereEqualTo("email", email).get().addOnCompleteListener { task ->

                if (task.isSuccessful) {

                    val list: MutableList<String> = ArrayList()
                    var key: String
                    var numEvals = 0

                    for (document in task.result) {

                        list.add(document.id)
                        key = document.id
                        createButtonDynamically(key)
                        numEvals += 1
                    }

                    if (numEvals == 0){
                        noEvaluationsTextView()

                    }

                    goBackMainMenuButton()
                    Log.d(TAG, list.toString())
                } else {

                    Log.d(TAG, "Error a la hora de encontrar las evaluaciones. ", task.exception)
                    showAlert()
                }
            }
    }

    private fun savePDF(key: String) {

        val mDoc = Document()
        val mFileName = key
        val mFilePath = Environment.getExternalStoragePublicDirectory(Environment
            .DIRECTORY_DOWNLOADS).absoluteFile.toString() + "/" + mFileName + ".pdf"

        try {
            PdfWriter.getInstance(mDoc, FileOutputStream(mFilePath))

            db.collection("informes").document(key).get().addOnSuccessListener {
                mDoc.open()
                mDoc.add(Paragraph("EVALUACIÓN DE PREVENCIÓN DE RIESGOS LABORALES EN" +
                        " ENTORNO DE TRABAJO CON PANTALLAS DE VISUALIZACIÓN: $key"))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion01") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion02") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion03") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion04") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion05") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion06") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion07") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion08") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion09") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion10") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion11") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion12") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion13") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion14") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion15") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion16") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion17") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion18") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion19") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion20") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion21") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion22") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion23") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion24") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion25") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion26") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion27") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion28") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion29") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion30") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion31") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion32") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion33") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion34") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion35") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph(it.get("opcion36") as String?))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph("   "))
                val usuario = it.get("email") as String?
                mDoc.add(Paragraph("Evaluación creada por el usuario " + usuario + " mediante la aplicación PVD Prevención."))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph("FUENTES DE INFORMACIÓN DE PVD PREVENCIÓN"))
                mDoc.add(Paragraph("   "))
                mDoc.add(Paragraph("Real Decreto 488/1997, de 14 de abril, sobre disposiciones mínimas de seguridad y salud relativas al trabajo con equipos que incluyen pantallas de visualización:\nhttps://www.boe.es/buscar/act.php?id=BOE-A-1997-8671"))
                mDoc.add(Paragraph("Guía técnica para la evaluación y prevención de los riesgos relativos a la utilización de equipos con pantallas de visualización:\nhttps://www.insst.es/documents/94886/789467/Gu%C3%ADa+t%C3%A9cnica+para+la+evaluaci%C3%B3n+y+prevenci%C3%B3n+de+los+riesgos+relativos+a+la+utilizaci%C3%B3n+de+equipos+con+pantallas+de+visualizaci%C3%B3n.pdf "))
                mDoc.close()
            }

            Toast.makeText(this, "Se ha generado el archivo $mFileName.pdf " +
                    " en la carpeta Descargas de su dispositivo.", Toast.LENGTH_LONG).show()
        } catch (e: Exception) {
            Toast.makeText(this, "Para poder descargar el PDF de la evaluación, primero debe darle permisos a la aplicación (consulte la ayuda pulsando en el icono del ''?'' en el menú principal.", Toast.LENGTH_LONG).show()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun createButtonDynamically(key: String) {

        val dynamicButton = Button(this)
        val dynamicButton2 = Button(this)
        val dynamicButton3 = Button(this)

        val dynamicCard = androidx.cardview.widget.CardView(this)
        val dynamicLayout = LinearLayout(this)
        dynamicLayout.orientation = LinearLayout.HORIZONTAL

        val buttonLayout = LinearLayout.LayoutParams(
            600,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        val buttonLayout2 = LinearLayout.LayoutParams(
            200,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        val buttonLayout3 = LinearLayout.LayoutParams(
            200,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        val cardView = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        val layout = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        buttonLayout.setMargins(0, 0, 0, 50)
        dynamicButton.layoutParams = buttonLayout

        buttonLayout2.setMargins(5, 0, 0, 50)
        dynamicButton2.layoutParams = buttonLayout2

        buttonLayout3.setMargins(5, 0, 0, 50)
        dynamicButton3.layoutParams = buttonLayout3

        cardView.setMargins(0, 0, 0, 50)
        dynamicCard.layoutParams = cardView

        layout.setMargins(0, 0, 0, 0)
        dynamicLayout.layoutParams = layout

        dynamicCard.setCardBackgroundColor(resources.getColor(R.color.black))

        dynamicButton.text = key
        dynamicButton.setBackgroundColor(resources.getColor(R.color.white))
        dynamicButton.setTextColor(resources.getColor(R.color.negro))

        dynamicButton2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.basura35, 0, 0, 0)
        dynamicButton2.setBackgroundColor(resources.getColor(R.color.white))
        dynamicButton2.setPadding(40,0,0,0,)

        dynamicButton3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.descargar35, 0, 0, 0)
        dynamicButton3.setBackgroundColor(resources.getColor(R.color.white))
        dynamicButton3.setPadding(30,0,0,0,)

        dynamicButton.setOnClickListener {
            val intent = Intent(this,ReportInfoActivity::class.java)
            intent.putExtra("clave", key)
            startActivity(intent)
        }

        dynamicButton2.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setMessage("¿Está seguro que quiere borrar la evaluación $key?")
            builder.setPositiveButton("Aceptar", null)
            builder.setPositiveButton("Aceptar") { dialog, which ->
                db.collection("informes").document(key).delete()
                showOK(key)
            }
            builder.setNegativeButton("Cancelar", null)
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        dynamicButton3.setOnClickListener {
            savePDF(key)
        }

        myReportsLayout.addView(dynamicLayout)
        dynamicLayout.addView(dynamicButton)
        dynamicLayout.addView(dynamicButton2)
        dynamicLayout.addView(dynamicButton3)

    }

    @SuppressLint("SetTextI18n")
    private fun noEvaluationsTextView() {
        // creating the button
        val dynamicTextView = TextView(this)

        val textViewLayout = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        textViewLayout.setMargins(0, 50, 0, 100)
        dynamicTextView.layoutParams = textViewLayout

        dynamicTextView.text = "No existen evaluaciones para mostrar. Realice primero una evaluación y" +
                " guárdela para que aparezca en esta lista."
        dynamicTextView.textSize = 17F
        dynamicTextView.setTextColor(resources.getColor(R.color.negro))

        // add Button to LinearLayout
        myReportsLayout.addView(dynamicTextView)

    }

    private fun showOK(key: String) {

        val builder = AlertDialog.Builder(this)
        builder.setMessage("Se ha borrado la evaluación $key correctamente.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.setOnDismissListener {
            val intent = Intent(this, MyReportsActivity::class.java)
            startActivity(intent)
        }
        dialog.show()
    }

    @SuppressLint("SetTextI18n")
    private fun goBackMainMenuButton() {
        // creating the button
        val dynamicButton = Button(this)

        val buttonLayout = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        buttonLayout.setMargins(0, 50, 0, 100)
        dynamicButton.layoutParams = buttonLayout

        dynamicButton.text = "Volver al menú principal"
        dynamicButton.setBackgroundColor(resources.getColor(R.color.acento))
        dynamicButton.setTextColor(resources.getColor(R.color.white))

        dynamicButton.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        // add Button to LinearLayout
        myReportsLayout.addView(dynamicButton)

    }

    private fun showAlert() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Error a la hora de encontrar las evaluaciones.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.setOnDismissListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        dialog.show()
    }

    override fun onBackPressed() {

    }
}
