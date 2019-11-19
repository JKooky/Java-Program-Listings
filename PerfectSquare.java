import java.util.Scanner;
import java.util.ArrayList;
public class PerfectSquare {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an interger m: ");
		int m = input.nextInt();
		int a=1,n=0;
		int now = m;
		
		for(int i = 2; i < now; i++) {
			while(m%i==0 && isPrime(i)) {
				list.add(i);
				list2.add(i);
				m = m/i;
			}
			if(m==1)
				break;
		}

		for (int i=0;i<list2.size();i++) {
			while(list.remove(list2.get(i))) {
				n++;
			}
			if(n%2==1) {
				a =a* list2.get(i);
			}
			n=0;
		}
		System.out.println("The smallest number n for m * n "
				+ "to be a perfect square is " + a);
		System.out.println("m * n is " + a*now);
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}