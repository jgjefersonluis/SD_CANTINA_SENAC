
package listadecontatos;

public class Contato {
    String nome;
    String email;
    String celular;

    public Contato() {
    }

    public Contato(String nome, String email, String celular) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
   
    @Override
    public String toString(){
        return nome + ":" + email ;
    }
    
    
}
