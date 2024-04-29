import java.util.Scanner;
public class aer313 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int c=0;
        int sueldo1;
        int sueldo2;
        int resul=0;
        c=r.nextInt();

        for (int i=0;i<c;i++){
            sueldo1=r.nextInt();
            sueldo2=r.nextInt();
            resul=sueldo1+sueldo2;
            if (resul>=0) {
                System.out.println("SI");
            }else System.out.println("NO");
        }
    }
}