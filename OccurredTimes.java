public class OccurredTimes {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] iTimes = new int[101];
		
		for (int i = 1; i <= 100; i++) {
			iTimes[i] = 0;
		}
		
		int iNum = input.nextInt();
		while (iNum != 0) {
			iTimes[iNum]++;
			iNum = input.nextInt();
		}
		
		for (int i = 1; i <= 100; i++) {
			if (iTimes[i] > 0)
				System.out.println(i + " occurs " + iTimes[i] + " times");
		}
	}
}