// Declaração da classe Funcionario, que herda de Pessoa e implementa as interfaces Usuario e Impostos
public class Funcionario extends Pessoa implements Usuario, Impostos { 
    
    // Atributos específicos da classe Funcionario
    private double salario; // Armazena o salário do funcionário
    private double inss;    // Armazena o valor do INSS a ser pago

    // Construtor da classe Funcionario, recebe os atributos necessários e inicializa o objeto
    Funcionario(String nome, int idade, String login, String senha, double salario, double inss) {
        super(nome, idade, login, senha); // Chama o construtor da classe Pessoa
        this.salario = salario; // Inicializa o salário
        this.inss = inss;       // Inicializa o valor do INSS
    }

    // Métodos getters e setters para acessar e modificar os atributos da classe
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

    // Implementação do método validarLogin da interface Usuario
    @Override
    public void validarLogin(String login, String senha) {
        // Verifica se o login e a senha informados correspondem aos armazenados
        if (this.getLogin().equals(login) && this.getSenha().equals(senha)) { 
            System.out.println("usuario válido"); // Exibe mensagem de sucesso
        } else {
            System.out.println("usuario inválido"); // Exibe mensagem de erro
        }
    }

    // Implementação do método calcularINSS da interface Impostos
    @Override
    public double calcularINSS() {
        // Define a alíquota do INSS de acordo com o salário do funcionário
        if (this.salario <= 965.67) { 
            this.inss = this.salario * 0.08; // 8% para salários até 965.67
        } else if (this.salario >= 965.68 && this.salario < 1609.45) { 
            this.inss = this.salario * 0.09; // 9% para salários entre 965.68 e 1609.44
        } else if (this.salario >= 1609.46) { 
            this.inss = this.salario * 0.11; // 11% para salários acima de 1609.45
            // Aplica o teto máximo do INSS, limitando o desconto a 354.08
            if (this.inss >= 354.08) { 
                this.inss = 354.08;
            }
        }
        return this.inss; // Retorna o valor do INSS calculado
    }
}