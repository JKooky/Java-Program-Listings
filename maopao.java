import java.util.Scanner;
public class maopao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[] dNum = new double[10];
		
		for (int i = 0; i < 10; i++) {
			dNum[i] = input.nextDouble();
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 9; j > i; j--) {
				if (dNum[j-1] > dNum[j]) {
					double dTmp = dNum[j];
					dNum[j] = dNum[j-1];
					dNum[j-1] = dTmp;
				}
			}
		}
		
		for (int i = 0; i < 9; i++) {
			System.out.print(dNum[i] + " ");
		}
		System.out.println(dNum[9]);
	}
}

