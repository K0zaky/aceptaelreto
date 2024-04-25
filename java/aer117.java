import java.util.Scanner;

public class aer117 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s="";
        int n=0;

        n = reader.nextInt(); reader.nextLine();

        for (int i = 0; i < n; i++) {
            s=reader.nextLine();
            String[] p = s.split(" ");
            String name = p[1];

            System.out.println("Hola, " + name+".");
        }
    }
}
