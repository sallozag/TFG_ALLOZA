package com.alloza.allprevention

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_faq.*

class FaqActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        title = "Preguntas frecuentes (FAQ)"

        //getText instead of getString to apply bold, cursive filters...
        expand_text_view.text = getText(R.string.faqP1yR1)
        expand_text_view2.text = getText(R.string.faqP2yR2)
        expand_text_view3.text = getText(R.string.faqP3yR3)
        expand_text_view4.text = getText(R.string.faqP4yR4)
        expand_text_view5.text = getText(R.string.faqP5yR5)
        expand_text_view6.text = getText(R.string.faqP6yR6)


        backAccButton.setOnClickListener {

            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }

}