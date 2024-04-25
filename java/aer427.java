import java.util.Scanner;
public class aer427 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int c=r.nextInt();
        String s="";
        String s1="";
        for (int i=0;i<c;i++){
            s=r.next();
            s1=r.next();
            if (s.equals("Luke") && s1.equals("padre")){
                System.out.println("TOP SECRET");
            }else System.out.println(s + ", yo soy tu " + s1);
        }
    }
}
