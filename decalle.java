import java.util.Scanner;
public class decalle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num=0;
        do {
            num = reader.nextInt();
            int resto=num%2;
            if (num==0) {
                
            }else if (resto==0)
            {System.out.println("DERECHA");
            }else System.out.println("IZQUIERDA");

        
        }while(num != 0);
        
    }
}
