package tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {

    public static ArrayList<String> Tarefa = new ArrayList<>();
    public static ArrayList<String> tarefaC= new ArrayList<>();
    public static ArrayList<String> Status = new ArrayList<>();
    public static ArrayList<String> Menu = new ArrayList<>();

    static String Brightgreen = "\u001b[32;1m";
    static String white = "\u001b[37m";

    private static Scanner scanner = new Scanner(System.in);

    public static void menu(){
        Menu.add(Brightgreen + "1:tarefa simples \n" + "2:tarefa com prazo \n" + "3:listar tarefas \n" +
                "4:mudar status da tarefa \n" + "5:remover tarefa\n" + "6:sair"
        );
        System.out.print(Menu);
    }

    public static double obterAção() {
        System.out.print("escolha uma ação: ");
        return scanner.nextDouble();
     };

    public static String obtertarefa(){
        System.out.print("escolha uma tarefa: ");
        return scanner.nextLine();
    }

    public static String obterstatus(){
        System.out.print("escolha um status: ");
        return scanner.nextLine();
    }

    public static String obterprazo(){
        System.out.print("escolha um status: ");
        return scanner.nextLine();
    }

    public static void listar(){
        for(int i = 0; i < Status.size(); i++) {
            System.out.println(i + 1 + white +": " + Tarefa.get(i) + " " + tarefaC.get(i) + " --" + Status.get(i));
        }
    }

    public static void adicionaNaLista(String tarefa, String status){
    Tarefa.add(tarefa);
    Status.add(status);
    }


}





