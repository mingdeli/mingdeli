package day02;

public class Shuzu {
	public static void main (String[] args){
		int[] arr={1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
				arr2[index] = arr[i];
				index++;
			}
		}
		int[] arr3 = new int[index];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr2[i];
			System.out.println(arr3[i]+" ");
		}
	}
}