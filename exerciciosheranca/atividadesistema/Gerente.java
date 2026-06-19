package exerciciosheranca.atividadesistema;
// esse projeto nao é nenhum software desemvolvido ou nada do tipo, é apenas pra praticar o conceito de herança.

public class Gerente {
    private String Nome;

    private String Email;

    private String Senha;

    public boolean add() {
        return true;
    }

    public String relatorioFinanciero(){
        System.out.println("Relatorio...");
        return "";
    }

    public String login(){
        System.out.println("Realizando login...");
        System.out.println("NOME: "+ this.Nome);
        System.out.println("EMAIL: "+ this.Email);
        System.out.print("SENHA: ");
        int s =  this.Senha.length();
        for (int i = 0; i < s; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        return "";
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}
