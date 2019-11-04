import java.util.Scanner;
public class StringSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		System.out.println(sort(str));
	}
	
	public static String sort(String s) {
		int isEmpty[] = new int[s.length()];
		for(int index = 0; index < s.length(); index++) isEmpty[index] = 0;
		String strA = "";
		int i = 0,j = 0;
		char sMin = 0;
		int iMin = 0;
		for(; i < s.length(); i++) {
			sMin = 'z';
			iMin = 0;
			for (j = 0; j < s.length(); j++) {
				if (isEmpty[j] != -1 && s.charAt(j) < sMin) {
					sMin = s.charAt(j);
					iMin = j;
				}
			}
			strA += sMin;
			isEmpty[iMin] = -1;
		}
		return strA;
	}
}
