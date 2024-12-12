package tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class tarefa_com_prazo extends Tarefas{

    private static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> Tarefa = new ArrayList<>();
    public static ArrayList<String> tarefaC= new ArrayList<>();
    public static ArrayList<String> Status = new ArrayList<>();

    public static String obtertarefa(){
        System.out.print("escolha uma tarefa: ");
        return scanner.nextLine();
    }

    public static String obterstatus(){
        System.out.print("escolha um status: ");
        return scanner.nextLine();
    }

    public static String obterprazo(){
        System.out.print("digite a data: ");
        return scanner.nextLine();
    }

    public static void adicionaNaLista(String tarefa, String status, String prazo){
        Tarefa.add(tarefa);
        Status.add(status);
        tarefaC.add(prazo);
    }

}
