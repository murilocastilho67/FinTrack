package com.example.fintrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_category)

        val btnOk = findViewById<Button>(R.id.btn_ok)
        btnOk.setOnClickListener {
            // Aqui você pode adicionar lógica para salvar a nova categoria, se necessário

            // Voltar para a tela principal
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
