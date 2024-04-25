import java.util.Scanner;

public class aer116 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n=0;

        
        n = reader.nextInt(); reader.nextLine();

        if(n>5){
        return;
        }else{
            for (int i=1; i<=n; i++){
                System.out.println("Hola mundo.");
            }
        }
    }
}
