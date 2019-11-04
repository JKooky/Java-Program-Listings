public class Difficult {
	public static void main(String[] args) {
		int[] open = new int[100];
		for (int i = 0; i < 100; i++) {
			open[i] = 1;
		}
		for(int i = 2; i <=100; i++) {
			for(int j = 0; j < 100; j++) {
				if((j+1)%i==0) {
					open[j] = -1 * open[j];
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			if(open[i] == 1) {
				System.out.println(i+1);
			}
		}
	}
}