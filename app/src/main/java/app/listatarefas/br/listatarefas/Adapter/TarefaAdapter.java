package app.listatarefas.br.listatarefas.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import app.listatarefas.br.listatarefas.Model.Tarefa;
import app.listatarefas.br.listatarefas.R;

public class TarefaAdapter extends RecyclerView.Adapter<TarefaAdapter.MyViewHolder> {

    List<Tarefa> tarefas;


    public TarefaAdapter(List <Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textTarefa;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textTarefa = itemView.findViewById(R.id.idTxtTarefa);
        }
    }
}
