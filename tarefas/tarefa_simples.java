package tarefas;

import java.util.Scanner;

public class tarefa_simples extends Tarefas{
    private static Scanner scanner = new Scanner(System.in);

    public static String obtertarefa(){
        System.out.print(magenta +"escolha uma tarefa: ");
        return scanner.nextLine();
    }

    public static String obterstatus(){
        System.out.print(magenta + "escolha um status: ");
        return scanner.nextLine();
    }

    public static void adicionaNaLista(String tarefa, String status){
        Tarefa.add(tarefa);
        Status.add(status);
    }




}
