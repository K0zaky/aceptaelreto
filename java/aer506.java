import java.util.Scanner;

public class aer506 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n1=0;
        int n2=0;
        String s = "";
        int n=0;

        n = r.nextInt(); r.nextLine();

        for (int i = 0; i < n; i++) {
            s = r.nextLine();
            //n1=r.nextInt();
            //n2=r.nextInt();
            String sp []=s.split("/");
            String sp2 [] = sp[0].split(" ");
            String sp3 [] = sp[1].split(" ");
            n1=Integer.parseInt(sp2[0]);
            n2=Integer.parseInt(sp3[1]);

            if (n1>n2 || n1==n2) {
                System.out.println("BIEN");
            }else{
                System.out.println("MAL");
            }
            
        }
        r.close();
    }
}
