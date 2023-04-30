import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeMoeda = "", emblema = "";
        double valor, real = 0, dolar = 0, euro = 0, pounds = 0;
        int moeda;

        System.out.println("Escolha uma moeda: \n" +
                "1. Real, 2. Dolar, 3. Euro, 4. Pounds");
        moeda = scan.nextInt();

        switch (moeda) {
            case 1:
                nomeMoeda = "Real";
                emblema = "R$";
                break;
            case 2:
                nomeMoeda = "Dolar";
                emblema = "US$";
                break;
            case 3:
                nomeMoeda = "Euro";
                emblema = "€";
                break;
            case 4:
                nomeMoeda = "Pounds";
                emblema = "£";
                break;
            default:
                System.out.println("Valor inválido !");
        }

        System.out.println("Você escolheu: " + nomeMoeda);

        System.out.println("Digite um valor:");
        valor = scan.nextDouble();

        System.out.println("Total: " + emblema + " " + valor);
        System.out.println("\nConvertendo...");

        if (moeda == 1) {
            real = 1;
            dolar = 0.20053;
            euro = 0.18022;
            pounds = 0.15948;

        } else if (moeda == 2){
            dolar = 1;
            real = 4.9868;
            euro = 0.8987;
            pounds = 0.79526;

        } else if (moeda == 3) {
            euro = 1;
            real = 5.54906;
            dolar = 1.11275;
            pounds = 0.88493;

        } else if(moeda == 4) {
            pounds = 1;
            real = 0.62765;
            dolar = 1.25745;
            euro = 1.13007;
        } else {
            System.out.println("Tipo moeda não localizada !");
        }

        System.out.println("Real: R$ " + (valor * real));
        System.out.println("Dolar: US$ " + (valor * dolar));
        System.out.println("Euro: € " + (valor * euro));
        System.out.println("Pounds: £ " + (valor * pounds));
    }
}
