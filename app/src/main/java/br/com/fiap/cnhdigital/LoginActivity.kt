package br.com.fiap.cnhdigital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

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