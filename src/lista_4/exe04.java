import java.util.Scanner;
public class exe04 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 int multiplicador;
		 
		 System.out.println("multiplicador: ");
		 multiplicador =s.nextInt();

	        for (int i = 0; i <= 10; i++){
	        	if (i % 2 == 1) {
					int conta = i * multiplicador;
		            System.out.println(i + " X " + multiplicador + " = " + conta);
	            }
	            
	        }
	}

}
