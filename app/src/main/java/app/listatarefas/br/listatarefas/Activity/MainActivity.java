package app.listatarefas.br.listatarefas.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import app.listatarefas.br.listatarefas.Adapter.TarefaAdapter;
import app.listatarefas.br.listatarefas.Model.Tarefa;
import app.listatarefas.br.listatarefas.R;

public class MainActivity extends AppCompatActivity {

    private List<Tarefa> tarefas = new ArrayList <Tarefa>();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerView);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            //Chamar outra activity sem estar na correspondente, usar o getAplicationContext
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdicionarTarefaActivity.class));
            }
        });
    }

    public void carregarListaTarefas(){

        //Configurar a lista de tarefas

        tarefas.add(new Tarefa("Alunos do Ifal Rio Largo"));
        tarefas.add(new Tarefa("Celulares "));
        tarefas.add(new Tarefa("Distribuicões Linux"));

        //Configurar o recyclerview

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);

        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));

        TarefaAdapter tarefaAdapter = new TarefaAdapter(tarefas);

        recyclerView.setAdapter(tarefaAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
