package br.com.fiap.cnhdigital

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_infracoes_por_infrator)

        var txtPrimeiraMulta = findViewById<TextView>(R.id.txtDescInfracao1);
        var txtSegundaMulta = findViewById<TextView>(R.id.txtDescInfracao2);

        var abrirPagamento = Intent(this, Pagamento::class.java)

        txtPrimeiraMulta.setOnClickListener{
            startActivity(abrirPagamento)
        }

        txtSegundaMulta.setOnClickListener{
            startActivity(abrirPagamento)
        }

    }

    val positiveButtonClick = {dialog: DialogInterface, which: Int ->

    }

    fun alertaMulta(view: View){
        var builder = AlertDialog.Builder(this)

        with(builder){
            setTitle("Pagamento")
            setMessage("Pagamento não permitido por aplicativo! Por favor entre em contato pelo telefone: (11) 2222-2222")
            setPositiveButton("OK", DialogInterface.OnClickListener(function = positiveButtonClick))
            builder.show()

        }
    }
}