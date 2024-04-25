import java.util.Scanner;
import java.lang.Math;

public class aer512 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int k1=0;
        int k2=0;
        int n=0;

        n = r.nextInt(); r.nextLine();

        for (int i = 0; i < n; i++) {
            k1=r.nextInt();
            k2=r.nextInt();

            int kk=(int)Math.floor(k1*100/(k1+k2));
            System.out.println(kk);
        }
    }
}
