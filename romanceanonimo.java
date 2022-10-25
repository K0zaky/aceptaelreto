import java.util.Scanner;
public class romanceanonimo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num=0;
        int n=0;
        int m=0;

        num = reader.nextInt(); reader.nextLine();

        for (int i=1; i<=num; i++){

                n = reader.nextInt();
                m = reader.nextInt();
                        if (n<m) {
                        System.out.println("ROMANCE");
                        }else if (n==m)
                        System.out.println("ROMANCE"); 
                        else System.out.println("PRINCIPIO");
                    }
                }
            }


    

