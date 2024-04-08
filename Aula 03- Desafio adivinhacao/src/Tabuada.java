import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        System.out.println("Tabuada do " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+ " x " + i + " = " + (num * i));
        }

    }
}
