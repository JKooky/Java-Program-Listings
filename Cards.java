public class Cards {
	public static void main(String[] args) {
		int[] iFlag = new int[4];
		String[] suits = {"Spadas", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		for (int i = 0; i < 4; i++) {
			iFlag[i] = 0;
		}
		while(iFlag[0] == 0 || iFlag[1] == 0 || iFlag[2] == 0 || iFlag[3] == 0) {
			int iCard = (int) (Math.random() * 52);
			if(iFlag[iCard/13] == 0) {
				iFlag[iCard/13]++;
				/*switch(iCard/13) {
				case 0:System.out.println(iCard%1
						+ "")
				case 1:
				case 2:
				case 3:
				*/
				}
				
			}
		}
		
	}


