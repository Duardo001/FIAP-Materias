package br.com.fiap.listadecompras

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.activity.viewModels


class   MainActivity : AppCompatActivity() {

    val viewModel: ItemsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        /**
         * Define o layout da atividade.
         * O layout é inflado e as visualizações são criadas.
         */
        setContentView(R.layout.activity_main)
        /**
         * Inicializa a barra de ferramentas e a configura como a barra de ação da atividade.
         * A barra de ferramentas é identificada pelo ID `toolbar` no arquivo de layout.
         */
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Lista de Compras"
        /**
         * Inicializa o RecyclerView e o ItemsAdapter.
         * O RecyclerView é identificado pelo ID `recyclerView` no arquivo de layout.
         * O ItemsAdapter é responsável por fornecer as visualizações dos itens na lista.
         */
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val itemsAdapter = ItemsAdapter()
        recyclerView.adapter = itemsAdapter
        /**
         * Inicializa o botão e o campo de texto.
         * O botão é identificado pelo ID `button` no arquivo de layout.
         * O campo de texto é identificado pelo ID `editText` no arquivo de layout.
         */
        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.textViewItem)
        /**
         * Define um listener de clique para o botão.
         * Quando o botão é clicado, verifica se o campo de texto está vazio.
         * Se estiver vazio, exibe um erro e retorna.
         * Se não estiver vazio, cria um novo item e o adiciona ao ItemsAdapter.
         */
        button.setOnClickListener {
            /**
             * Se o campo de texto estiver vazio, exibe um erro e retorna.
             */
            if (editText.text.isEmpty()) {
                editText.error = "Preencha um valor"
                return@setOnClickListener
            }

            /**
             * Cria um novo item e o adiciona ao ItemsAdapter.
             * O item é criado com o texto do campo de texto e uma função de
             * remoção que remove o item do ItemsAdapter.
             */

            itemsAdapter.addItem(item)
            viewModel.addItem(editText.text.toString())
            editText.text.clear()

        }


        /**
         * Observa as alterações na lista de itens na ViewModel.
         * Quando a lista de itens é alterada, atualiza o ItemsAdapter com a nova lista.
         */
        viewModel.itemsLiveData.observe(this) {
            items -> itemsAdapter.updateItems(items)
        }

    }
}

