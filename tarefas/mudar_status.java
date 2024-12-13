package tarefas;

public class mudar_status extends Tarefas{

    public static String obterNovaTarefa(){
        System.out.print(magenta + "escreva a nova tarefa: ");
        return scanner.next();
    }

    public static double obterindice(){
        System.out.print(magenta + "escolha o indice do status: ");
        return scanner.nextDouble();
    }

    public static void mudaStatus(Double indice, String novoStatus){
        for (double i = 0; i < Status.size(); i++) {
            if(i == indice - 1 ){
                Status.set((int)i, novoStatus);
            };
        }
    }

}
