import java.util.Scanner;

public class aer370 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n=r.nextInt();
        r.nextLine();
        
        for (int i=0;i<n;i++){
            String c=r.nextLine();
            String[] cc=c.split("-");
            if (Integer.parseInt(cc[0])+1==Integer.parseInt(cc[1])||Integer.parseInt(cc[0])==Integer.parseInt(cc[1])+1) {
                if (Integer.parseInt(cc[0])<Integer.parseInt(cc[1])) {
                    if (Integer.parseInt(cc[0])%2==0) {
                        System.out.println("SI");
                    }else{
                        System.out.println("NO");
                    }
                }else if(Integer.parseInt(cc[1])<Integer.parseInt(cc[0])){
                    if (Integer.parseInt(cc[1])%2==0) {
                        System.out.println("SI");
                    }else{
                        System.out.println("NO");
                    }
                }
            }else{
                System.out.println("NO");
            }

        }
        r.close();
    }
}
