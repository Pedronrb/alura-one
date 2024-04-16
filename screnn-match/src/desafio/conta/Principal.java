package desafio.conta;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroDaConta(123456);
        conta1.setSaldo(5000.00);
        conta1.setTitular("Pedro");

        System.out.println("Numero da conta: " + conta1.getNumeroDaConta()
        + " Saldo: " + conta1.getSaldo() + " Titular da conta: " + conta1.getTitular());

        conta1.setSaldo(1850);
        System.out.println("Novo valor: " + conta1.getSaldo());
    }
}
