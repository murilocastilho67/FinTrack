package com.example.fintrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class AddExpenseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_expense)

        val titleEditText = findViewById<EditText>(R.id.et_title)
        val categorySpinner = findViewById<Spinner>(R.id.spinner_category)
        val priceEditText = findViewById<EditText>(R.id.et_price)
        val createButton = findViewById<Button>(R.id.btn_create)

        createButton.setOnClickListener {
            // Aqui você pode adicionar o código para salvar a nova despesa

            // Voltar para a tela principal
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}