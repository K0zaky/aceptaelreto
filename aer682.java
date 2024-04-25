import java.util.Scanner;


public class aer682 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s="";
        int n=0;

        n = reader.nextInt(); reader.nextLine();

        for (int i = 0; i < n; i++) {
            s=reader.nextLine();
    

            int r2 = Integer.parseInt(s)*2;

            System.out.println(s + " " + r2);
        }
    }
}
