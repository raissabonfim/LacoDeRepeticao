public class atividade6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0;
        System.out.println("De quantos números você quer fazer uma média:");
        n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o números " + (i + 1) + ": ");
            double num = sc.nextDouble();
            soma += num;
        }
        System.out.println("Á média dos números digitados é " + soma / n);
    }
}
