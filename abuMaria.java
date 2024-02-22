import java.util.Scanner;
    public class abuMaria {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
       
            int[] d1 = new int[6];
            int[] d2 = new int[6];
            int c=sc.nextInt();

            for (int i=0;i<c;i++){

                for (int j = 0; j < d1.length; j++) {
                    d1[j]=sc.nextInt();
                }

                for (int j = 0; j < d2.length; j++) {
                    d2[j]=sc.nextInt();
                }

                int s=d1[0]+d2[0];

                boolean k=true;

                for (int j = 1; j < d2.length; j++) {
                    if (d1[j]+d2[j]!=s) {
                        k=false;
                    }
                }
                
                if (k) {
                   System.out.println("SI"); 
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
