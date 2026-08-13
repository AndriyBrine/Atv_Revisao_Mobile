package com.example.revisao

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.revisao.databinding.ActivityMainBinding
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Instancia a tela com o xml = inflar o layout com viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Renderizo a tela
        setContentView(binding.root)

        // Evento de click do botão login
        binding.loginBtn.setOnClickListener {
            // Captura do (texto do) login -> Retorna o login
            val login = binding.loginInput.text.toString().trim()
            // Captura do (texto da) senha -> Retorna a senha
            val senha = binding.senhaInput.text.toString().trim()

            // Verificar se o login e senha estão válidos
            if (login == "Andriy" && senha == "1234567890") {
                // Passar o login para a tela de Dashboard
                // Classe intent é responsável por enviar dados (texto, numero, float, boolean etc, classes, arrays) de uma tela para outra
                // this = tela onde esta, Dashboard = para onde quer ir; ::class.java (uma regra da linguagem) <- por tras dos panos tudo isso aqui vira java.
                val intent = Intent(this, Dashboard::class.java)
                // putExtra(PlaceHolderCasoAVariavelVenhaVazia/NomeDaVariavel, DadoQueVaiPassar)
                // Envia o login para a tela de Dashboard usando a declaração LOGIN_USUARIO como IDENTIFICAÇÃO.
                intent.putExtra("LOGIN_USUARIO", login)
                // Inicia a nova activity configurada no val intent = (...), levando o login (que esta dentro do intent) dentro
                startActivity(intent)
                // Vai tirar a tela inicial que está no segundo plano da memória
                finish()

            } else {
                // Mostrar mensagem para o usuário; Toast é o POPUP que aparece na tela; this = aparece NESSA TELA onde o this está
                Toast.makeText(this, "Login e senha incorretos!", Toast.LENGTH_LONG).show()
            }
        }
    }
}
