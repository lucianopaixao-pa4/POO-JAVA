package RelacionamentoEntreClasses.exemplo1;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(){

    }

    public Contato(String nome, String tele, String email) {
        this.email = email;
        this.nome = nome;
        this.telefone = tele;
    }

    public String obterInfo(){
        return "Nome: " + nome +
                "\nTelefone: " + telefone +
                "\nEmail: " + email;
    }

    String getNome(){
        return this.nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
