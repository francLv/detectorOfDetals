import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ready = 0;
        int refactor = 0;
        int brake = 0;
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int result = scanner.nextInt();
            if (result == 0) {
                ready++;
            } else if (result == 1) {
                refactor++;
            } else {
                brake++;
            }
        }
        System.out.print(ready + " " + refactor + " " + brake);
    }
}