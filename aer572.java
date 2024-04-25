import java.util.Scanner;

public class aer572 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String s = "";
        int n = 0;

        n = r.nextInt();
        r.nextLine();

        for (int i = 0; i < n; i++) {
            s = r.nextLine();
            String[] p = s.split(" ");
            boolean z = false;
            boolean a = false;
            
            for (int j = 0; j < p.length; j++) {
                double g = Double.parseDouble(p[j]);
                
                if (g == 0.0) {
                    z = true;
                } else if (g > 8.9) {
                    a = true;
                }
            }
            
            if (z && !a) {
                System.out.println("SUSPENSO DIRECTO");
            } else {
                System.out.println("MEDIA");
            }
        }
        r.close();
    }
}
