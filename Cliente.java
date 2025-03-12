public class Cliente extends Pessoa implements Usuario {
    private int numeroCartao;
    
    Cliente (String nome, int idade, String login, String senha, int numeroCartao){
        super(nome,idade,login,senha);
    }
    
    public int getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    
    @Override
        public void validarLogin(String login, String senha){
        if(this.getLogin().equals(login) && this.getSenha().equals(senha)){
            System.out.println("usuario inválido");
        }
    }
}