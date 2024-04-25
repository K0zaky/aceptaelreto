import java.util.Scanner;
public class aer446 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int c=0;  
        int c2=0;
        String nom="";
        String nomnie="";
        
        c=r.nextInt(); r.nextLine();
        for (int i=0;i<c;i++){
            nom=r.next();
            boolean compro=true;
            c2=Integer.parseInt(r.next());
            for (int j=1;j<c2;j++) { 
                nomnie=r.next();
                if (nom.equals(nomnie)) {
                    compro=false;
                }
            }
            String last =r.next();

            if (c2>1&&compro&&last.equals(nom)) {
                System.out.println("VERDADERA");
            }else System.out.println("FALSA");
        }
    }
}
