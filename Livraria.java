public class Livraria {

    public static void main(String[] args) { // Método principal que inicia a execução do programa
        // Criação de um objeto da classe Cliente com os dados do cliente
        Cliente clienteUm = new Cliente(" rosangela ",  35 , " rrxxrr ", "1234", 22222);
        
        // Exibe as informações do cliente chamando o método toString()
        System.out.println("Cliente: " + clienteUm.toString());
        
        // Valida o login do cliente comparando o usuário e a senha informados com os cadastrados
        clienteUm.validarLogin(" rrxxrr ", " 4321 ");

        System.out.println(""); // Linha em branco para organização da saída no console

        // Criação de um objeto da classe Funcionario com os dados do funcionário
        Funcionario funcionarioUm = new Funcionario(" Pedro antonio ", 34 , " ppxxpp ", " 6543 ", 742, 0);
        
        // Exibe as informações do funcionário chamando o método toString()
        System.out.println("Funcionario: " + funcionarioUm.toString());
        
        // Valida o login do funcionário comparando o usuário e a senha informados com os cadastrados
        funcionarioUm.validarLogin("ppxxpp", "6543");
        
        // Calcula e exibe o valor do INSS a ser pago pelo funcionário
        System.out.println("INSS a pagar: " + funcionarioUm.calcularINSS());
    }
}