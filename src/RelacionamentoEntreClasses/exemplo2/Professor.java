package RelacionamentoEntreClasses.exemplo2;

public class Professor {
    private String nome;
    private String Departmento;
    private String email;

    public Professor(String departmento, String email, String nome) {
        this.Departmento = departmento;
        this.email = email;
        this.nome = nome;
    }

    public String getDepartmento() {
        return Departmento;
    }

    public void setDepartmento(String departmento) {
        Departmento = departmento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
