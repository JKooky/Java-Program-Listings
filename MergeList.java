import java.util.Scanner;
public class MergeList {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int l1_len = input.nextInt();
		int[] list1 = new int[l1_len];
		for (int i = 0; i < l1_len; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2: ");
		int l2_len = input.nextInt();
		int[] list2 = new int[l2_len];
		for (int i = 0; i < l2_len; i++) {
			list2[i] = input.nextInt();
		}
		int[] list3 = new int[l1_len + l2_len];
		merge(list1, list2, list3);
		System.out.print("The merged list is ");
		for(int i = 0; i < list3.length; i++) {
			System.out.print( list3[i] + " "); 
		}
	}
	public static void merge(int[] list1, int[] list2, int[] list3) {
		
		int i = 0;
		int j = 0;
		int now = 0;
		while (i < list1.length && j < list2.length) {
			if(list1[i] <= list2[j]) {
				list3[now] = list1[i];
				i++;
				now = now + 1;
			}else {
				list3[now] = list2[j];
				j++;
				now = now + 1;
			}
			
		}
		if (i < list1.length) {
			for (;i<list1.length;i++) {
				list3[now] = list1[i];
				now = now + 1;
			}
				
			
		}
		if(j<list2.length) {
			for(;j<list2.length;j++) {
				list3[now] = list2[i];
				now = now + 1;
			}
				
		}
		}


}
