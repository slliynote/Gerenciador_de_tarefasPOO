import tarefas.tarefa_simples;
import tarefas.Tarefas;
import tarefas.tarefa_com_prazo;
import java.util.Scanner;
public class main {



    public static void main(String[] args) {

        double acao;

    tarefa_simples TarefaSimples = new tarefa_simples();
    Tarefas tarefas = new Tarefas();
    tarefa_com_prazo prazo = new tarefa_com_prazo();




    do{
        Tarefas.menu();
        acao = Tarefas.obterAção();

        switch ((int)acao){

            case 1 :
                String nome = TarefaSimples.obtertarefa();
                String nome2 = TarefaSimples.obterstatus();
                tarefa_simples.adicionaNaLista(nome,nome2);
                break;

            case 2 :
                String nome3 = prazo.obtertarefa();
                String nome4 = prazo.obterstatus();
                String nome5 = prazo.obterprazo();
                tarefa_com_prazo.adicionaNaLista(nome3,nome4,nome5);
                break;

            case 3 :

                break;

        }


    }while(acao == 6);


    }


}
