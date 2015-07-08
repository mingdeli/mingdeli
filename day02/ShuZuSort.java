package day02;
// 运用数组，排序
public class ShuZuSort {
	public static void main(String[] args){
		
		int k;
		int[] arr={12,4,2,6,89,32,41,65,12,0};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			k=i;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j])
					{k=arr[j];arr[j]=arr[i];arr[i]=k;}
			}
		}
		System.out.println("排序后：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
