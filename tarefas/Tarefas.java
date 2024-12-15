package tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Tarefas {

    //instanciamento dos arrays
    public static ArrayList<String> Tarefa = new ArrayList<>();
    public static ArrayList<String> tarefaC= new ArrayList<>();
    public static ArrayList<String> Status = new ArrayList<>();
    public static ArrayList<String> Menu = new ArrayList<>();

    //adicionando cores
    static String Brightgreen = "\u001b[32;1m";
    static String white = "\u001b[37m";
    static String magenta = "\u001b[35m";
    static String Brightblue = "\u001b[34;1m";

    public static Scanner scanner = new Scanner(System.in);

    // metodo da classe menu
    public static void menuStatico(){}

    // metodo da classe menu
    public static void menu(){}

    // metodo da classe menu
    public static int obterAção() {
        return scanner.nextInt();
     };

    // metodo da classe tarefa simples
    public static String obtertarefa(){
        return scanner.nextLine();
    }

    // metodo da classe mudar status
    public static double obterindice(){
        return scanner.nextDouble();
    }

    // metodo da classe mudar status
    public static String obterNovoStatus(){
        return scanner.nextLine();
    }

    // metodo da classe mudar status
    public static void mudaStatus(Double indice, String novoStatus){
    }

    // metodo da classe tarefa simples
    public static String obterstatus(){
        return scanner.nextLine();
    }

    // metodo da classe tarefa com prazo
    public static String obterprazo(){
        return scanner.nextLine();
    }

    // metodo da classe remover tarefas
    public static double obterAtarefaParaRemover(){
        return scanner.nextDouble();
    }

    // metodo da classe remover tarefas
    public static void RemoveTarefas(double removeT){
    }

    // metodo da classe menu
    public static void listar(){}

    // metodo da classe tarefa simples/ tarefa com prazo
    public static void adicionaNaLista(String tarefa, String status, String TarefaC){
    }


}





