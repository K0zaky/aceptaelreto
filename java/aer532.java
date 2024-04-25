import java.util.Scanner;

public class aer532 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s="";
        int n=0;

        n = reader.nextInt(); reader.nextLine();

        for (int i = 0; i < n; i++) {
            s=reader.nextLine();
            String[] p = s.split(" ");
            String n1 = p[0];
            String n2 = p[1];

            int r = Integer.parseInt(n2)-Integer.parseInt(n1);

            System.out.println(r);

        }
    }    
}
