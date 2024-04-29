import java.util.Scanner;

public class aer372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            System.out.println(im(s));
        }

        sc.close();
    }

    public static String im(String s) {
        StringBuilder r = new StringBuilder();
        StringBuilder m = new StringBuilder();
        boolean[] mayus = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                m.append(Character.toLowerCase(c));
                mayus[i] = true;
            } else {
                m.append(c);
            }
        }

        String inv = new StringBuilder(s).reverse().toString().toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = inv.charAt(i);
            if (mayus[i]) {
                r.append(Character.toUpperCase(c));
            } else {
                r.append(c);
            }
        }

        return r.toString();
    }
}
