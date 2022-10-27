import java.util.Scanner;
public class arena {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar;
        ar = sc.nextInt();
		while (ar!=0){
            for (int i = 0; i < ar; i++) {
                System.out.print("1");
            }
            System.out.println();
            ar=sc.nextInt();
		}
	}
}
