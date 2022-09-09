package br.com.fiap.cnhdigital

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //setContentView(R.layout.activity_infracoes_por_infrator)

        //Ações da View Login Activity
        //Instanciando botões da view
        var buttonOk = findViewById<Button>(R.id.OkButton)
        buttonOk.setOnClickListener {

            //Instanciando uma intent para chamada da avtivity DetalhesInfracaoActivity
            var intentAbrirInfracoesPorInfrator = Intent(this, InfracoesPorInfrator::class.java)

            //Chamando outra activity
            startActivity(intentAbrirInfracoesPorInfrator)
        }

        var buttonCadastro = findViewById<Button>(R.id.CadastroButton)
        buttonCadastro.setOnClickListener {

            //Instanciando uma intent para chamada da avtivity CadastrarUsuarioActivity
            var intentAbrirCadastrarUsuarioActivity = Intent(this, CadastrarUsuarioActivity::class.java)

            //Chamando outra activity
            startActivity(intentAbrirCadastrarUsuarioActivity)
        }




    }
}