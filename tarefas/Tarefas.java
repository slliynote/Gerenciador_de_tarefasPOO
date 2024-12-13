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
    static String magenta = "\u001b[35m";
    static String Brightblue = "\u001b[34;1m";

    public static Scanner scanner = new Scanner(System.in);

    public static void menuStatico(){
        Menu.add(Brightgreen + "\n1:tarefa simples \n" + "2:tarefa com prazo \n" + "3:listar tarefas \n" +
                "4:mudar status da tarefa \n" + "5:remover tarefa\n" + "6:sair"
        );
    }

    public static void menu(){
        System.out.print(Menu);
    }

    public static int obterAção() {
        System.out.print(Brightblue + "\nescolha uma ação: ");
        return scanner.nextInt();
     };

    public static String obtertarefa(){
        System.out.print(magenta + "escolha uma tarefa: ");
        return scanner.nextLine();
    }

    public static double obterindice(){
        System.out.print(magenta + "escolha o indice do status: ");
        return scanner.nextDouble();
    }

    public static String obterNovoStatus(){
        System.out.print(magenta + "escreva o novo status: ");
        return scanner.nextLine();
    }

    public static void mudaStatus(Double indice, String novoStatus){
        for (double i = 0; i < Status.size(); i++) {
            if(i == indice - 1 ){
                Status.set((int)i, novoStatus);
            };
        }
    }

    public static String obterstatus(){
        System.out.print(magenta + "escolha um status: ");
        return scanner.nextLine();
    }

    public static String obterprazo(){
        System.out.print(magenta + "escolha um status: ");
        return scanner.nextLine();
    }

    public static double obterAtarefaParaRemover(){
        System.out.print(magenta + "escreva o indice da tarefa que vai remover");
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


    public static void listar(){
        for(int i = 0; i < Status.size(); i++) {
            System.out.println(i + 1 + white +": " + Tarefa.get(i) + " " + tarefaC.get(i) + " --" + Status.get(i));
        }
    }

    public static void adicionaNaLista(String tarefa, String status, String TarefaC){
    Tarefa.add(tarefa);
    Status.add(status);
    tarefaC.add(TarefaC);
    }


}





