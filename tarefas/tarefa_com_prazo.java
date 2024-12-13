package tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class tarefa_com_prazo extends Tarefas{

    private static Scanner scanner = new Scanner(System.in);

    public static String obtertarefa(){
        System.out.print(magenta + "escolha uma tarefa: ");
        return scanner.nextLine();
    }

    public static String obterstatus(){
        System.out.print(magenta +"escolha um status: ");
        return scanner.nextLine();
    }

    public static String obterprazo(){
        System.out.print(magenta + "digite a data: ");
        return scanner.nextLine();
    }

    public static void adicionaNaLista(String tarefa, String status, String prazo){
        Tarefa.add(tarefa);
        Status.add(status);
        tarefaC.add(prazo);
    }

}
