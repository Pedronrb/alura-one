package desafio.interfac;

public class ConversorDeMoedas implements ConversaoFinanceira {

    @Override
    public void converterDolaParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("A conversão é: " + valorReal);
    }
}
