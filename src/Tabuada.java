import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] tabuada = new int[11];
        System.out.println("digite um número de 1 até 10: ");
        int num1 = num.nextInt();

        for (int i = 1; i < 11; i++) {

            tabuada[i] = num1 * i;

            System.out.println("o resultado da sua tabuada é: " + tabuada[i]);

        }
    }
}
