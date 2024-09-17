public class atividade4 {
    public static void main(String[] args) {

        int id;
        Scanner idade = new Scanner(System.in);
        do {
            System.out.println("Insira a sua idade:");
            id = idade.nextInt();
            if (id <= 0) {
                System.out.println("Insira uma idade válida!");
            }
        } while (id <= 0);

    }
}
