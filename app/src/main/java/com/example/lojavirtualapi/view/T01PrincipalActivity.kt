package com.example.lojavirtualapi.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lojavirtualapi.R
import com.example.lojavirtualapi.databinding.ActivityT01PrincipalBinding

class T01PrincipalActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityT01PrincipalBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with(binding){
            btnPrincipalProdutos.setOnClickListener {
                listarProdutos()
            }

            btnPrincipalCarrinho.setOnClickListener {
                abrirCarrinhoDeCompras()
            }

            btnPrincipalUsuarios.setOnClickListener {
                abrirUsuarios()
            }

            btnPrincipalPostagens.setOnClickListener {
                abrirPostagens()
            }
        }

    }

    private fun abrirPostagens() {
        startActivity(
            Intent(this, T05PostagensDetalheActivity::class.java)
        )
    }

    private fun abrirUsuarios() {
        startActivity(
            Intent(this, T04UsuariosDetalheActivity::class.java)
        )
    }

    private fun abrirCarrinhoDeCompras() {
        startActivity(
            Intent(this, T03CarrinhoDeComprasDetalheActivity::class.java)
        )
    }

    private fun listarProdutos() {
        startActivity(
            Intent(this, T02ListagemProdutosDetalheActivity::class.java)
        )
    }
}