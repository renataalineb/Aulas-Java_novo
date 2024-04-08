import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número");
        int num1 = sc.nextInt();
        System.out.println("Insira outro número");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Os núumeros são iguais");
        } else if (num1 > num2){
            System.out.println("Os números são diferentes e o primeiro é maior");
        } else {
            System.out.println("Os números são diferentes e o segundo é maior");
        }


    }
}
