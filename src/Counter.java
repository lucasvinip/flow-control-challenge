import java.util.Locale;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {
        int startNumber, endNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        startNumber = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (maior que o primeiro): ");
        endNumber = scanner.nextInt();

        scanner.close();

        try {
            for (int i = startNumber; i < endNumber; i++) {
                System.out.println("Imprimindo o número " + i);
            }
            contar(startNumber, endNumber);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número deve ser menor que o segundo número.");
        }

    }

    private static void contar(int startNumber, int endNumber) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (startNumber >= endNumber)
            throw new ParametrosInvalidosException();

        int contagem = startNumber - endNumber;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i--) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
