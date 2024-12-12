package tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {

    public static ArrayList<String> Tarefa = new ArrayList<>();
    public static ArrayList<String> tarefaC= new ArrayList<>();
    public static ArrayList<String> Status = new ArrayList<>();


    private static Scanner scanner = new Scanner(System.in);

    public static void interaçãoComOUsuario(){
     System.out.print("escolha uma ação: ");
    }


    public static String obtertarefa(){
        System.out.print("escolha uma tarefa: ");
        return scanner.nextLine();
    }

    public static String obterstatus(){
        System.out.print("escolha um status: ");
        return scanner.nextLine();
    }

    public static void adicionaNaLista(String tarefa, String status){
    Tarefa.add(tarefa);
    Status.add(status);
    }


}





