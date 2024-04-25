import java.util.Scanner;

public class aer715 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int s1=0;
        int s2=0;
        int n=0;

        n = r.nextInt(); r.nextLine();

        for (int i = 0; i < n; i++) {
            s1=r.nextInt();
            s2=r.nextInt();
            int res=s1/s2;

            if (res>=12) {
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            
        }
    }
}
