// Escreva uma classe Agenda, que contém vários contatos do tipo Contato.
//        Cada contato possui nome, telefone e email. A Agenda também possui um
//        nome. Crie um programa teste que peça para o usuário entrar com o
//        nome da Agenda e em seguida 3 contatos. Crie métodos que retornem
//        uma String com a informação de cada contato e também de todos os
//        contatos da agenda.
package RelacionamentoEntreClasses.exemplo1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarAgenda {
    public static void main(String[] args) {
        // em TestarCurso tem outra solução para o mesmo tipo de problema sem a precisão de muita escrita
//        no arquivo teste e mais nos metodos


        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = leitor.nextLine();

        Agenda age1 = new Agenda(nome);
        //Agenda agenda = new Agenda();
        //agenda.setNome(nome);

        ArrayList<Contato> contatos = new ArrayList<>();
        for (int i=0; i<3; i++){
            System.out.println("Entre com as informações do contato " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            nome = leitor.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = leitor.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email: ");
            String email = leitor.nextLine();
            c.setEmail(email);

            contatos.add(c);
        }

        age1.setContatos(contatos);

        if (age1 != null){
            System.out.println(age1.obterInfo());
        }



//        Para testes mais rapidos comente as linhas acimas e utilizem essas
//        Contato con1 = new Contato("lucas", "(99) 99999-9999", "lucas@gmail.com");
//        Contato con2 = new Contato("Carlos", "(99) 88888-8888", "carlos@gmail.com");
//        Contato con3 = new Contato("Eduardo", "(99) 77777-7777", "eduardo@gmail.com");
//
//        Agenda age2 = new Agenda(con1,con2,con3,"Agenda teste");
//
//        System.out.println(age2.obterInfo());
//        System.out.println();
//        System.out.println(age2.obterInfoContatoEspcifico("Carlos"));

//        São para os metodos comentados na classe Agenda
//        System.out.println(age2.AcharContato("Carlos"));
//        System.out.print(age2.AcharContatos());
    }
}
