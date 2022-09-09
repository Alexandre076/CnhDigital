package br.com.fiap.cnhdigital

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class InfracoesPorInfrator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infracoes_por_infrator)

        //Ações da View DetalhesInfracaoActivity
        //Instanciando botões da view
        var textDetalheInfracao1 = findViewById<TextView>(R.id.txtDescInfracao1)
        textDetalheInfracao1.setOnClickListener {

            //Instanciando uma intent para chamada da avtivity DetalhesInfracaoActivity
            var intentAbrirPagamento = Intent(this, Pagamento::class.java)

            //Chamando outra activity
            startActivity(intentAbrirPagamento)
        }

    }
}