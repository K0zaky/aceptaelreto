import java.util.Scanner;
public class taumaturgodeltormento {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int c=r.nextInt();
        String s="";
        String s2="";
        String s3="";
        for (int i=0;i<c;i++){
            s=r.next();
            s2=r.next();
            s3=r.next();
            s=s.toLowerCase();
            s2=s2.toLowerCase();
            s3=s3.toLowerCase();
            if (s.equals(s3)) {
                System.out.println("TAUTOLOGIA");
            } else {
                System.out.println("NO TAUTOLOGIA");
            }
        }
    }
}
