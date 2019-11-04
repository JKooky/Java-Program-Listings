import java.util.Scanner;
public class OrderStudents {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int iNumOfStu = input.nextInt();
		String sName[] = new String[iNumOfStu];
		int iScore[] = new int[iNumOfStu];
		int i, j;	
		// 录入学生姓名与成绩
		for (i = 0; i < iNumOfStu; i++) {
			int iOrder = i + 1;
			System.out.print("Enter the name of Student" + iOrder + " : ");
			sName[i] = input.next();
			System.out.print("Enter the scores of Student" + iOrder + " : ");
			iScore[i]= input.nextInt();
		}
		
		// 排序
		int Max = 0;
		for (i = 0; i < iNumOfStu - 1; i++) {
			for (j = i + 1 ; j < iNumOfStu; j++) {
				if (iScore[i] < iScore[j]) {
					int iTmp = iScore[i];
					iScore[i] = iScore[j];
					iScore[j] = iTmp;
					Max = j;
				}
			}
			System.out.println(sName[Max]);
		}
		System.out.println(sName[i]);
	}
}