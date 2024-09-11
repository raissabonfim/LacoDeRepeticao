import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        String[] tabuada = new String[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número de 1 até 10" + i);
            tabuada[1] = sc.next();
        }

    }
}
