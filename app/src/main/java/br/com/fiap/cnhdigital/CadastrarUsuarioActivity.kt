package br.com.fiap.cnhdigital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CadastrarUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_usuario)

        //Ações da View CadastrarUsuarioActivity
        var buttonCadastrarUsuario = findViewById<Button>(R.id.buttoCadastrarUsuario)
        buttonCadastrarUsuario.setOnClickListener {

            //Instanciando uma intent para chamada da avtivity LoginActivity após o cadastro "realizado com sucesso"
            var intentAbrirLoginActivity = Intent(this, LoginActivity::class.java)

            //Chamando outra activity
            startActivity(intentAbrirLoginActivity)

            Toast.makeText(this, "Cadastro efetuado!\nRealize seu login 😊.", Toast.LENGTH_LONG).show()
        }
    }
}