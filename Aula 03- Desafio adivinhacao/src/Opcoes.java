import java.util.Scanner;

public class Opcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.println("Digite o valor do l");
                double l = sc.nextDouble();
                double areaQuadrado = l * l;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;
            } else if (opcao == 2) {
                System.out.println("Digite o valor do raio");
                double raio = sc.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
                break;
            } else if (opcao ==3 ) {
                System.out.println("Programa Encerrado");
                break;

            } else {
                System.out.println("Opção inválida, tente novamente");
            }

        }
        }
}
