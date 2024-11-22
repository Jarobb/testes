import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numerosDigitado = 0;

        while (tentativas < 5) {

            System.out.print("faça um chute de 0 a 100: ");
            numerosDigitado = leitura.nextInt();
            tentativas++;


            if (numerosDigitado == numeroGerado) {
                System.out.println("você acertou em " + tentativas + " tentativas.");
                break;
            } else if (numerosDigitado < numeroGerado) {
                System.out.println("o número digitado é MENOR que o numero gerado: ");
                
            } else {
                System.out.println("o número digitado é MAIOR que o numero gerado: ");
            }
            if (tentativas == 5 && numerosDigitado != numeroGerado){
                System.out.println("Você não conseguiu, o numero era: "+ numeroGerado);
            }

        }







    }
}