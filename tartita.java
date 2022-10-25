import java.util.Scanner;
public class tartita {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;
        int c1;
        int c2;
        int f;

        n = reader.nextInt(); reader.nextLine();

        for (int i=1; i<=n; i++){
            c1=reader.nextInt();
            c2=reader.nextInt(); 
            f=reader.nextInt();
            int r=c1*c2;
            if (r==f||r>f) {
                System.out.println("1");
            }else{
                int r2=f/r;
                int r3=f%r;
                if (r3!=0) {
                    r2=r2+1;
                    
                }
                System.out.println(r2);
                
            }
        }
    }
}
