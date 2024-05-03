import java.util.Scanner;

public class aer191 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n;
        int n1;
        int n2;
        int n3;
        int nt;

        n = r.nextInt(); r.nextLine();

        for (int i = 0; i < n; i++) {
            nt = 0;
            n1=r.nextInt();
            n2=r.nextInt();
            n3=r.nextInt();

            for (int j = 0; j < n1; j++){            
                nt+=n2;
                n2=n2-n3;
            }
            System.out.println(nt);

        }

        r.close();
    }
}
