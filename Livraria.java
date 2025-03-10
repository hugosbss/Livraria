package livraria;

public class Livraria {

    public static void main(String[] args) {
        Cliente clienteUm = new Cliente("rosangela", 35, "rrxxrr", "1234", 22222);
        System.out.println("Cliente: " + clienteUm.toString());
        clienteUm.validarLogin("rrxxrr", "4321");

        System.out.println("");

        Funcionario funcionarioUm = new Funcionario("pedro antonio", 34, "ppxxpp", "6543", 742, 0);
        System.out.println("Funcionario: " + funcionarioUm.toString());
        funcionarioUm.validarLogin("ppxxpp", "6543");
        System.out.println("INSS a pagar: " + funcionarioUm.calcularINSS());
    }
}