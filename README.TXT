----------------------------------------------------------------------------
import java.util.Scanner;

public class Hanoi {
    static void hanoi(int n, char inicial, char finalPino, char auxiliar) {
        if (n == 1) {
            System.out.printf("Mova o disco %d do pino %c para o pino %c%n", n, inicial, finalPino);
        } else {
            hanoi(n - 1, inicial, auxiliar, finalPino);
            System.out.printf("Mova o disco %d do pino %c para o pino %c%n", n, inicial, finalPino);
            hanoi(n - 1, auxiliar, finalPino, inicial);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 'A', 'B', 'C');
    }
}