import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		double A, B, C, R1, R2;
		Scanner i =new Scanner(System.in);
		A = i.nextDouble();
		B = i.nextDouble();
		C = i.nextDouble();
		
		if ((A == 0) || (((B*B) -(4*A*C)) < 0)) {
			System.out.print("Impossivel calcular\n");
		}else {
			R1 = ((-B + Math.sqrt(((B*B) -(4*A*C)))) / (2*A));
			R2 = ((-B - Math.sqrt(((B*B) -(4*A*C)))) / (2*A));
			
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}
		
		
	}

}