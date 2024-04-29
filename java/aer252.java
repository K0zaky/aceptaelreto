import java.util.Scanner;

public class aer252 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String casos=r.nextLine();
        
        
        while (!casos.equals("XXX")) {    
            String espacio=casos.replaceAll(" ", "");
            String minuscula=espacio.toLowerCase();
            
            boolean uuh=palabra(minuscula);
            if (uuh) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            casos=r.nextLine();
        }
        
        
    }


    public static boolean palabra(String minus){
  
        boolean correcto=false;

        if (minus.length()==1 || minus.length()==0) {
            correcto=true;
        }
        else if (minus.charAt(0)==minus.charAt(minus.length()-1)){
            correcto=palabra(minus.substring(1, minus.length()-1));
        }

        return correcto;
    }
}