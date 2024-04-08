import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;

        while (tentativas < 5){
            System.out.println("Digite um número entre 0 e 100");
            int numeroDigitado = sc.nextInt();
            tentativas++;

            if(numeroDigitado == numeroGerado){
                System.out.println("Você acertou o número");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o gerado");

            } else{
                System.out.println("O número digitado é maior que o gerado");
            }
        }
        System.out.println("Você não conseguiu adivinhar o número. O número era: " + numeroGerado);
    }
}
