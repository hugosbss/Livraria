public class Pessoa {
    private String nome, login, senha;
    private int idade;
    
    Pessoa (String nome, int idade, String login, String senha){
        this.nome = nome;
        this.idade = idade;
        this.login = login;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    @Override
        public String toString(){
            return "Nome" + getNome() + "idade" + getIdade() + "login" + getLogin();
        }
}