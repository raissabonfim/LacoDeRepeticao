public class atividade3 {
    public static void main(String[] args) {
        Scanner fatorial = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Insira um número maior que  zero para saber seu fatorial: ");
            numero = fatorial.nextInt();

            if (numero < 0) {
                System.out.println("número invalido, insira outro");
            }
        } while (numero < 0);

        double resultado = 1;
        int i = 1;

        do {
            resultado *= i;
            i++;
        } while (i <= numero);
        System.out.println("O seu número fatorado é " + numero + " e o resultado é: " + resultado);

    }
}
