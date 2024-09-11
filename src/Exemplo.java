import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        String[] nomesJogadores = new String[10];
        Scanner sc = new Scanner(System.in);

        //incialização; Condição; Incremento;
        // ++ -> vai somar +1 i = i + 1
        for(int i = 0; i < 5; i++){
            System.out.println("Informe o nome do Player " + i);
            nomesJogadores[i] = sc.next();

        }

        // Pedir o nome do time A
        // Pedir os omes do time A guardar (5 nomes)
        // Pedir os omes do time B
        // Pedir os omes do time B guardar (5nomes)
        Scanner Scanner = new Scanner(System.in);
        String[] timeA = new String[5], timeB = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Jogador " + (i + 1) + " do Time A: ");
            timeA[i] = sc.next();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Jogador " + (i + 1) + " do Time B: ");
            timeB[i] = sc.next();
        }

        sc.close();
    }
}
