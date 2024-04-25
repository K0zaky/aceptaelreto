import java.util.Scanner;

public class aer362 {
    public static void main(String[] args) {
     
        Scanner reader = new Scanner(System.in);

        int n=0;
        int dia=0;
        int mes=0;

        n = reader.nextInt(); reader.nextLine();

        for (int i=1; i<=n; i++){

                dia = reader.nextInt();
                mes = reader.nextInt();
                if (dia==25&&mes==12) {
                    System.out.println("SI");
                }else System.out.println("NO");


        }
    }
}
