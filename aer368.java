import java.util.Scanner;
import java.lang.Math;
public class aer368 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int huevos=0;
            int olla=0; int minutos=0;
        do {
            huevos = sc.nextInt();
            olla = sc.nextInt();
            if (huevos == 0){
                
            }else if (huevos <= olla){
                int delicioso = minutos+10;
                System.out.println(delicioso);
            }
    
            if (huevos > olla){
            double divi = (double)huevos/olla;
            int hambre = (int)Math.ceil(divi);
            int delicioso = hambre*10;
            System.out.println(delicioso);
            }
        } while (huevos != 0 && olla != 0);
    }
}
