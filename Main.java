import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        int n = scanner.nextInt();
        int sum = 0;
        while (i < n) {
            sum += 1;
            i++;
        }
        System.out.println(sum);
    }
}
