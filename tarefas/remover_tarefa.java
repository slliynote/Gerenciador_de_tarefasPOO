package tarefas;

public class remover_tarefa extends Tarefas{

    public static double obterAtarefaParaRemover(){
        System.out.print(magenta + "escreva o indice da tarefa que vai remover: ");
        return scanner.nextDouble();
    }

    public static void RemoveTarefas(double removeT){
        for (double i = 0; i < Status.size(); i++) {
            if(i == removeT - 1 ){
                Tarefa.remove((int)removeT-1);
                Status.remove((int)removeT -1);
                tarefaC.remove((int)removeT -1);
            };
        }
    }

}
