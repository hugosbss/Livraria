package livraria;

public class Funcionario extends Pessoa implements Usuario, Impostos {
    private double salario;
    private double inss;
    
    Funcionario (String nome, int idade, String login, String senha, double salario, double inss) {
        super(nome, idade, login, senha);
        this.salario = salario;
        this.inss = inss;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    @Override
    public void validarLogin(String login, String senha) {
        if (this.getLogin().equals(login) && this.getSenha().equals(senha)) {
            System.out.println("usuario válido");
        } else {
            System.out.println("usuario inválido");
        }
    }

    @Override
    public double calcularINSS() {
        if (this.salario <= 965.67) {
            this.inss = (this.salario * 0.08);
        } else if (this.salario >= 965.68 && this.salario < 1609.45) {
            this.inss = (this.salario * 0.09);
        } else if (this.salario >= 1609.46) {
            this.inss = (this.salario * 0.11);
            if (this.inss >= 354.08) {
                this.inss = 354.08;
            }
        }
        return this.inss;
    }
}