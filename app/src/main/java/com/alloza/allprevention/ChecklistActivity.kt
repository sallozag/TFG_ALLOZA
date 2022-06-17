package com.alloza.allprevention

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_checklist.*

class ChecklistActivity : AppCompatActivity() {

    private var opcion1 = ""
    private var opcion2 = ""
    private var opcion3 = ""
    private var opcion4 = ""
    private var opcion5 = ""
    private var opcion6 = ""
    private var opcion7 = ""
    private var opcion8 = ""
    private var opcion9 = ""
    private var opcion10 = ""
    private var opcion11 = ""
    private var opcion12 = ""
    private var opcion13 = ""
    private var opcion14 = ""
    private var opcion15 = ""
    private var opcion16 = ""
    private var opcion17 = ""
    private var opcion18 = ""
    private var opcion19 = ""
    private var opcion20 = ""
    private var opcion21 = ""
    private var opcion22 = ""
    private var opcion23 = ""
    private var opcion24 = ""
    private var opcion25 = ""
    private var opcion26 = ""
    private var opcion27 = ""
    private var opcion28 = ""
    private var opcion29 = ""
    private var opcion30 = ""
    private var opcion31 = ""
    private var opcion32 = ""
    private var opcion33 = ""
    private var opcion34 = ""
    private var opcion35 = ""
    private var opcion36 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checklist)

        title = "Realizar evaluación"
        val resultsButton = findViewById<Button>(R.id.resultadosButton)
        resultsButton.setOnClickListener {

            onCheckboxClicked(checkbox1)
            onCheckboxClicked(checkbox2)
            onCheckboxClicked(checkbox3)
            onCheckboxClicked(checkbox4)
            onCheckboxClicked(checkbox5)
            onCheckboxClicked(checkbox6)
            onCheckboxClicked(checkbox7)
            onCheckboxClicked(checkbox8)
            onCheckboxClicked(checkbox9)
            onCheckboxClicked(checkbox10)
            onCheckboxClicked(checkbox11)
            onCheckboxClicked(checkbox12)
            onCheckboxClicked(checkbox13)
            onCheckboxClicked(checkbox14)
            onCheckboxClicked(checkbox15)
            onCheckboxClicked(checkbox16)
            onCheckboxClicked(checkbox17)
            onCheckboxClicked(checkbox18)
            onCheckboxClicked(checkbox19)
            onCheckboxClicked(checkbox20)
            onCheckboxClicked(checkbox21)
            onCheckboxClicked(checkbox22)
            onCheckboxClicked(checkbox23)
            onCheckboxClicked(checkbox24)
            onCheckboxClicked(checkbox25)
            onCheckboxClicked(checkbox26)
            onCheckboxClicked(checkbox27)
            onCheckboxClicked(checkbox28)
            onCheckboxClicked(checkbox29)
            onCheckboxClicked(checkbox30)
            onCheckboxClicked(checkbox31)
            onCheckboxClicked(checkbox32)
            onCheckboxClicked(checkbox33)
            onCheckboxClicked(checkbox34)
            onCheckboxClicked(checkbox35)
            onCheckboxClicked(checkbox36)
            showResults(opcion1, opcion2, opcion3, opcion4, opcion5, opcion6, opcion7, opcion8,
                opcion9, opcion10, opcion11, opcion12, opcion13, opcion14, opcion15, opcion16,
                opcion17, opcion18, opcion19, opcion20, opcion21, opcion22, opcion23, opcion24,
                opcion25, opcion26, opcion27, opcion28, opcion29, opcion30, opcion31, opcion32,
                opcion33, opcion34, opcion35, opcion36)

        }
    }

    @SuppressLint("ResourceType")
    fun onCheckboxClicked(view: View) {

        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkbox1 -> {
                    opcion1 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox1NOTOK)
                    }
                }
                R.id.checkbox2 -> {
                    opcion2 = if (checked) {
                        getString(R.string.checkbox2OK)
                    } else {
                        getString(R.string.checkbox2NOTOK)
                    }
                }
                R.id.checkbox3 -> {
                    opcion3 = if (checked) {
                        getString(R.string.checkbox3OK)

                    } else {
                        getString(R.string.checkbox3NOTOK)
                    }
                }

                R.id.checkbox4 -> {
                    if (checked) {
                        opcion4 = getString(R.string.checkbox4OK)

                    } else {
                        opcion4 = getString(R.string.checkbox4NOTOK)
                    }
                }

                R.id.checkbox5 -> {
                    opcion5 = if (checked) {
                        getString(R.string.checkbox5OK)

                    } else {
                        getString(R.string.checkbox5NOTOK)
                    }
                }

                R.id.checkbox6 -> {
                    opcion6 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox6NOTOK)
                    }
                }

                R.id.checkbox7 -> {
                    opcion7 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox7NOTOK)
                    }
                }

                R.id.checkbox8 -> {
                    opcion8 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox8NOTOK)
                    }
                }

                R.id.checkbox9 -> {
                    opcion9 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox9NOTOK)
                    }
                }

                R.id.checkbox10 -> {
                    opcion10 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox10NOTOK)
                    }
                }

                R.id.checkbox11 -> {
                    opcion11 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox11NOTOK)
                    }
                }

                R.id.checkbox12 -> {
                    opcion12 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox12NOTOK)
                    }
                }

                R.id.checkbox13 -> {
                    opcion13 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox13NOTOK)
                    }
                }

                R.id.checkbox14 -> {
                    opcion14 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox14NOTOK)
                    }
                }

                R.id.checkbox15 -> {
                    opcion15 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox15NOTOK)
                    }
                }

                R.id.checkbox16 -> {
                    opcion16 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox16NOTOK)
                    }
                }

                R.id.checkbox17 -> {
                    opcion17 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox17NOTOK)
                    }
                }

                R.id.checkbox18 -> {
                    opcion18 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox18NOTOK)
                    }
                }

                R.id.checkbox19 -> {
                    opcion19 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox19NOTOK)
                    }
                }

                R.id.checkbox20 -> {
                    opcion20 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox20NOTOK)
                    }
                }

                R.id.checkbox21 -> {
                    opcion21 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox21NOTOK)
                    }
                }

                R.id.checkbox22 -> {
                    opcion22 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox22NOTOK)
                    }
                }

                R.id.checkbox23 -> {
                    opcion23 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox23NOTOK)
                    }
                }

                R.id.checkbox24 -> {
                    opcion24 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox24NOTOK)
                    }
                }

                R.id.checkbox25 -> {
                    opcion25 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox25NOTOK)
                    }
                }

                R.id.checkbox26 -> {
                    opcion26 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox26NOTOK)
                    }
                }

                R.id.checkbox27 -> {
                    opcion27 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox27NOTOK)
                    }
                }

                R.id.checkbox28 -> {
                    opcion28 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox28NOTOK)
                    }
                }

                R.id.checkbox29 -> {
                    opcion29 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox29NOTOK)
                    }
                }

                R.id.checkbox30 -> {
                    opcion30 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox30NOTOK)
                    }
                }

                R.id.checkbox31 -> {
                    opcion31 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox31NOTOK)
                    }
                }

                R.id.checkbox32 -> {
                    opcion32 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox32NOTOK)
                    }
                }

                R.id.checkbox33 -> {
                    opcion33 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox33NOTOK)
                    }
                }

                R.id.checkbox34 -> {
                    opcion34 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox34NOTOK)
                    }
                }

                R.id.checkbox35 -> {
                    opcion35 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox35NOTOK)
                    }
                }

                R.id.checkbox36 -> {
                    opcion36 = if (checked) {
                        getString(R.string.checkbox1OK)

                    } else {
                        getString(R.string.checkbox36NOTOK)
                    }
                }
            }
        }
    }

    private fun showResults(opcion1: String, opcion2: String, opcion3: String, opcion4: String,
                            opcion5: String, opcion6: String, opcion7: String, opcion8: String,
                            opcion9: String, opcion10: String, opcion11: String, opcion12: String,
                            opcion13: String, opcion14: String, opcion15: String, opcion16: String,
                            opcion17: String, opcion18: String, opcion19: String, opcion20: String,
                            opcion21: String, opcion22: String, opcion23: String, opcion24: String,
                            opcion25: String, opcion26: String, opcion27: String, opcion28: String,
                            opcion29: String, opcion30: String, opcion31: String, opcion32: String,
                            opcion33: String, opcion34: String, opcion35: String, opcion36: String) {

        val resultsIntent: Intent = Intent(this, ResultsActivity::class.java).apply {
            putExtra("opcion1", opcion1)
            putExtra("opcion2", opcion2)
            putExtra("opcion3", opcion3)
            putExtra("opcion4", opcion4)
            putExtra("opcion5", opcion5)
            putExtra("opcion6", opcion6)
            putExtra("opcion7", opcion7)
            putExtra("opcion8", opcion8)
            putExtra("opcion9", opcion9)
            putExtra("opcion10", opcion10)
            putExtra("opcion11", opcion11)
            putExtra("opcion12", opcion12)
            putExtra("opcion13", opcion13)
            putExtra("opcion14", opcion14)
            putExtra("opcion15", opcion15)
            putExtra("opcion16", opcion16)
            putExtra("opcion17", opcion17)
            putExtra("opcion18", opcion18)
            putExtra("opcion19", opcion19)
            putExtra("opcion20", opcion20)
            putExtra("opcion21", opcion21)
            putExtra("opcion22", opcion22)
            putExtra("opcion23", opcion23)
            putExtra("opcion24", opcion24)
            putExtra("opcion25", opcion25)
            putExtra("opcion26", opcion26)
            putExtra("opcion27", opcion27)
            putExtra("opcion28", opcion28)
            putExtra("opcion29", opcion29)
            putExtra("opcion30", opcion30)
            putExtra("opcion31", opcion31)
            putExtra("opcion32", opcion32)
            putExtra("opcion33", opcion33)
            putExtra("opcion34", opcion34)
            putExtra("opcion35", opcion35)
            putExtra("opcion36", opcion36)
        }
        startActivity(resultsIntent)
    }

}