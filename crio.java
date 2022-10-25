import java.util.Scanner;
public class crio {
    public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int casos;
		long num;
		long mayor=0; 
		long menor=0; 
		int tmen=0;
		int tmay=0;

		casos = reader.nextInt();


		for(int i=0; i<casos; i++) {

		    num = reader.nextLong();

		    menor = 9999999999999L;
		    mayor = 0;

			while(num != 0) {

				if(num < menor) {

					menor = num;
					tmen = 1;
							
				} else if(menor == num) {
					
					tmen++;
					
				}

				if(num > mayor) {

					mayor = num;
					tmay = 1;

				} else if(mayor == num) {
					
					tmay++;

				}

				
				num = reader.nextLong();

			}

			System.out.printf("%d %d %d %d\n", menor, tmen, mayor, tmay);

		}

	}

}
