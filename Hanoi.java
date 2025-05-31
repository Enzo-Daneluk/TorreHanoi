
import java.util.Scanner;

public class Hanoi {
    static int movimentos = 0; // Contador de movimentos

    static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            movimentos++;
            System.out.printf("Mova o disco %d do pino %c para o pino %c%n", n, origem, destino);
        } else {
            hanoi(n - 1, origem, auxiliar, destino);
            movimentos++;
            System.out.printf("Mova o disco %d do pino %c para o pino %c%n", n, origem, destino);
            hanoi(n - 1, auxiliar, destino, origem);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de discos: ");
        int n = sc.nextInt();
        System.out.println("\nMovimentos necessários:");
        hanoi(n, 'A', 'C', 'B');
        System.out.printf("\nTotal de movimentos: %d\n", movimentos); //(2^n)-1 é o número de movimentos padrão pela entrada
    }
}
