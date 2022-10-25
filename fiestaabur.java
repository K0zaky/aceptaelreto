import java.util.Scanner;

public class fiestaabur {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num=0;

        num = reader.nextInt(); reader.nextLine();
        String no;
        String persona;

        for (int i=1; i<=num; i++){
            no=reader.next();
            persona=reader.next();
            System.out.println("Hola" + ", " + persona +  ".");
        }
    }
}
