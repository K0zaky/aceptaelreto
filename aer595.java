import java.util.Scanner;

public class aer595 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int s=0;
        int n=0;

        n = reader.nextInt(); reader.nextLine();

        for (int i = 0; i < n; i++) {
            s=reader.nextInt();
            int p=s/100;
            System.out.println(p);
        }
    }
}