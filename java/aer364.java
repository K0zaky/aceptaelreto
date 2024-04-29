import java.util.Scanner;

public class aer364 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String to = sc.nextLine();

        while (!to.equals("FIN")) {
            int d = 1;

            String tc = cifrarCesar(to, d);

            System.out.println(tc);

            to = sc.nextLine();

        }

        sc.close();
        
    }

    public static String cifrarCesar(String txt, int d) {
        StringBuilder tc = new StringBuilder();

        for (int i = 0; i < txt.length(); i++) {
            char car = txt.charAt(i);

            if (Character.isLetter(car)) {
                int ascii = (int) car;
                int asciic = ascii + d;

                if (asciic > 'Z') {
                    asciic -= 26;
                } else if (asciic < 'A') {
                    asciic += 26;
                }
                
                tc.append((char) asciic);
            } else {
                tc.append(car);
            }
        }

        return tc.toString();
    
    }
}
