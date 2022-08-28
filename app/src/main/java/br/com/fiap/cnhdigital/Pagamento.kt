package br.com.fiap.cnhdigital

import android.content.ClipData
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Pagamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagamento)
    }

    fun inputEmail(view: View){

        var builder = AlertDialog.Builder(this)
        builder.setTitle("Email.:")

        val input = EditText(this)
        input.setHint("Digite o email")
        input.inputType = TYPE_TEXT_VARIATION_EMAIL_ADDRESS
        builder.setView(input)

        builder.setPositiveButton("OK", DialogInterface.OnClickListener{ dialog, which ->
            var textEmail = input.text.toString()
        })

        builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener {dialog, which -> dialog.cancel()})

        builder.show()

    }

    fun copiarCodigoBarras(view: View){

        //Verificar a opcao de copiar o texto

        var builder = android.app.AlertDialog.Builder(this)

        with(builder){
            setTitle("Pagamento por código de barras:")
            setMessage("92838934389638963897568")
            setPositiveButton("OK", DialogInterface.OnClickListener {dialog, which ->})
            builder.show()
        }
    }
}
