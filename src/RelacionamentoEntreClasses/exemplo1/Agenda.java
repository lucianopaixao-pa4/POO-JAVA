package RelacionamentoEntreClasses.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String NomedaAgenda;
    private ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda(String nomedaAgenda) {
        NomedaAgenda = nomedaAgenda;
    }

    public Agenda(Contato con1, Contato con2, Contato con3, String nomedaAgenda) {
        this.contatos.add(con1);
        this.contatos.add(con2);
        this.contatos.add(con3);
        this.NomedaAgenda = nomedaAgenda;
    }

    public String getNomedaAgenda() {
        return NomedaAgenda;
    }

    public void setNomedaAgenda(String nomedaAgenda) {
        NomedaAgenda = nomedaAgenda;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }


    public String obterInfo() {
        String info = "Nome da agenda:" + NomedaAgenda + "\n";

        if (contatos != null) {
            for (Contato c : contatos) {
                info += c.obterInfo() + "\n";
            }
        }

        return info;
    }

    public String obterInfoContatoEspcifico(String nome) {
        String info = "Nome da agenda = " + NomedaAgenda + "\n";

        if (contatos != null) {
            for (Contato c : contatos) {
                if((c.getNome().equals(nome))){
                    info += c.obterInfo() + "\n";
                }
            }
        }

        return info;
    }


//    public String AcharContato(String nome){
//        String informacao = "// contato: ";
//        for(int i = 0; i < this.contatos.size(); i++){
//            if (contatos.get(i).getNome().equals(nome)){
//                informacao += contatos.get(i).getNome() + "//" + contatos.get(i).getTelefone()
//                        + "//" + contatos.get(i).getEmail();
//                return informacao;
//            }
//        }
//        System.out.println("Não encrontado");
//        return nome;
//    }
//    public String AcharContatos(){
//        String informarContatos = "//contatos: ";
//        for(int i = 0; i < this.contatos.size(); i++){
//                String informacao = contatos.get(i).getNome() + "//" + contatos.get(i).getTelefone()
//                        + "//" + contatos.get(i).getEmail() + "\r\n";
//                informarContatos = informarContatos + informacao;
//        }
//        System.out.println("Não encrontado");
//        return informarContatos;
//
//    }
}
