import java.util.Scanner;

public class DesafioControleFluxo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        int digitoUm = sc.nextInt();
        System.out.println("Digite outro valor");
        int digitoDois = sc.nextInt();

        try {
            contagem(digitoUm, digitoDois);
        } catch (NumeroInvalido e) {
            System.out.println("ERROR");
        }
    }

    static void contagem(int p, int p2) throws NumeroInvalido {
        if (p > p2) {
            throw new NumeroInvalido();
        }
        int total = p2 - p;
        for (int i = 1; i < total; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}



