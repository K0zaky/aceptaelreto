import java.util.Scanner;

public class aer300 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s="";
        int n=0;
        //String vocales["a","e","i","o","u"];

        n = reader.nextInt(); reader.nextLine();

        for (int i = 0; i < n; i++) {
            s=reader.next();
            if (s.toLowerCase().contains("a")&&s.toLowerCase().contains("e")&&s.toLowerCase().contains("i")&&s.toLowerCase().contains("o")&&s.toLowerCase().contains("u")) {
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            
        }

    }
    
}
