import java.util.Scanner;
public class PrintDistinctNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] iDistinctNum = new int[10];
		int iNumOfDistinct = 0;
		int i;
		for (i = 0; i < 10; i++) {
			int iNum = input.nextInt();
			int isD = 1;//boolean
			for (int j = 0; j < iNumOfDistinct; j++) {
				if (iDistinctNum[j] == iNum) {
					isD = 0;
				}
			}
			if (isD == 1) {
				iDistinctNum[iNumOfDistinct] = iNum;
				iNumOfDistinct++;
			}
		}
		System.out.println("The number of distinct number is " + iNumOfDistinct);
		System.out.print("The distinct numbers are:");
		for (i = 0; i <iNumOfDistinct - 1; i++) {
			System.out.print(iDistinctNum[i] + " ");
		}
		System.out.println(iDistinctNum[i]);
	}
}