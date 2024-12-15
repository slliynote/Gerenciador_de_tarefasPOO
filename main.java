import tarefas.tarefa_simples;
import tarefas.tarefa_com_prazo;
import tarefas.mudar_status;
import tarefas.remover_tarefa;
import tarefas.menu;


    public static void main(String[] args) {

        int acao;

    tarefa_simples TarefaSimples = new tarefa_simples();
    tarefa_com_prazo prazo = new tarefa_com_prazo();
    mudar_status mudar = new mudar_status();
    remover_tarefa remove = new remover_tarefa();


 menu.menuStatico();

    do{
        menu.menu();
        acao = menu.obterAção();

        switch (acao){

            case 1 :
                String nome = TarefaSimples.obtertarefa();
                String nome2 = TarefaSimples.obterstatus();
                tarefa_simples.adicionaNaLista(nome,nome2,"");
                break;

            case 2 :
                String nome3 = prazo.obtertarefa();
                String nome5 = prazo.obterprazo();
                String nome4 = prazo.obterstatus();
                tarefa_com_prazo.adicionaNaLista(nome3,nome4,nome5);
                break;

            case 3 :
                 menu.listar();
                break;

            case 4 :
                double nome6 = mudar.obterindice();
                String nome8 = mudar.obterNovaTarefa();
                mudar.mudaStatus(nome6,nome8);
                break;

            case 5 :
                double nome9 = remove.obterAtarefaParaRemover();
                remove.RemoveTarefas(nome9);
                break;

        }
    }while(acao != 6);


    }



