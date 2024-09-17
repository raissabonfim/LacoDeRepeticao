public class atividade5 {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int num = 0;

        int int_random = (int) (Math.random() * (max - min + 1) + min);
        Scanner sc = new Scanner(System.in);
        System.out.println("Tente acertar um número entre 1 e 100 para sair do loop ");
        while (num != int_random) {
            System.out.println("Tente novamente");
            num = sc.nextInt();

        }
        System.out.println("você acertou, parabéns! ");

    }
}
