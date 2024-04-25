import java.util.Scanner;

public class aer344 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = "";
        int cass = 0;
        int cuentah = 0;
        int cuentam = 0;

        cass = reader.nextInt(); 
        reader.nextLine();
        
        for (int i = 0; i < cass; i++) {
            reader.nextLine();
            cuentah = 0;
            cuentam = 0;
            
            s = reader.nextLine();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'H') {
                    cuentah++;
                } else if (c == 'M') {
                    cuentam++;
                }
            }

            if (cuentah == cuentam) {
                System.out.println("POSIBLE");
            } else {
                System.out.println("IMPOSIBLE");
            }
        }
    }
}
