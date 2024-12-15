package tarefas;

public class menu extends Tarefas{


    public static void menu(){
        System.out.print(Menu);
    }

    public static void menuStatico(){
        Menu.add(Brightgreen + "\n1:tarefa simples \n" + "2:tarefa com prazo \n" + "3:listar tarefas \n" +
                "4:mudar status da tarefa \n" + "5:remover tarefa\n" + "6:sair"
        );
    }

    public static int obterAção() {
        System.out.print(Brightblue + "\nescolha uma ação: ");
        return scanner.nextInt();
    };

    public static void listar(){
        for(int i = 0; i < Status.size(); i++) {
            System.out.println(i + 1 + white +": " + Tarefa.get(i) + " " + tarefaC.get(i) + " --" + Status.get(i));
        }
    }

}
