import java.util.Scanner;
import tarefas.tarefa_simples;
import tarefas.Tarefas;

public class main {



    public static void main(String[] args) {

    tarefa_simples TarefaSimples = new tarefa_simples();

    String nome = Tarefas.obtertarefa();
    String nome2 = Tarefas.obterstatus();
    Tarefas.adicionaNaLista(nome,nome2);




    }


}
