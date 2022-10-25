import java.util.Scanner;

public class SanFermines {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numToros; int v; int max;
        while (sc.hasNext()){
            numToros = sc.nextInt();
            max =0;
                for (int i=0; i < numToros; i++){
                    v = sc.nextInt();
                    if(v > max){
                    max = v;
                    }
                }
            System.out.println(max);
        }
    }
}