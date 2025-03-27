package br.com.puc.imc

// Importações de bibliotecas necessárias para o funcionamento do código
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

// Definição da classe IMCActivity
class IMCActivity : AppCompatActivity() {

    // Declaração das variáveis
    lateinit var btnCalcularImc: Button
    lateinit var etPeso: EditText
    lateinit var etAltura: EditText
    lateinit var tvResultado: TextView

    // Criando a função onCreate (inicialização da tela)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc)

        // Inicializando as views (componentes da interface)
        etPeso = findViewById(R.id.etPeso)
        etAltura = findViewById(R.id.etAltura)
        btnCalcularImc = findViewById(R.id.btnCalcularIMC)
        tvResultado = findViewById(R.id.tvResultado)

        // Definição do comportamento do botão
        btnCalcularImc.setOnClickListener {

            // Calculando o IMC
            val peso = etPeso.text.toString().toDouble()
            val altura = etAltura.text.toString().toDouble()
            val imc = peso / Math.pow(altura, 2.0)

            // Exibir o resultado do IMC na tela
            tvResultado.text = "Seu IMC é $imc"

            // Função para guardar o IMC no Firebase
            guardarIMCFirestore(imc)
        }

        // Ajustes na interface para telas com bordas
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Função para guardar o IMC no Firestore
    fun guardarIMCFirestore(imc: Double) {
        val db = Firebase.firestore // Cria o acesso ao banco de dados

        // Criar um documento com o IMC e salvar no Firestore
        val docIMC = hashMapOf(
            "valor" to imc
        )

        // Salvar o IMC na coleção "imcs"
        db.collection("imcs")
            .add(docIMC)

            // Se o IMC for salvo com sucesso no Firestore, uma mensagem de sucesso será registrada nos logs.
            .addOnSuccessListener {
                Log.d("FIREBASE", "IMC salvo com sucesso")
            }

            // Se ocorrer um erro ao salvar o IMC, uma mensagem de erro será registrada nos logs.
            .addOnFailureListener { e ->
                Log.e("FIREBASE", "Erro ao salvar IMC", e)
            }
    }
}


