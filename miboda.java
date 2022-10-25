import java.util.Scanner;
public class miboda {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n=0;
        int g;
        int i=0;
        do {
            g=0;
            n=reader.nextInt();
            if (n!=0) {
                for (i=1; i<=n; i++){
                    g+= reader.nextInt();
                }
                System.out.println(g);
            }
        } while (n!=0);
    }
}
