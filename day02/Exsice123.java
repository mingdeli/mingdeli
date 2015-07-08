package day02;

public class Exsice123 {
	public static void main(String[] args){
		//九九乘法表
		System.out.println("九九乘法表：");
		for (int i = 0; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");	
			}
			System.out.println();
		}
		
		//打印一个三角形图像
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		//打印一个等要三角形2：
		System.out.println("打印一个三角形2：");
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < 10; j++) {
				if(i>j)
					System.out.print(" ");
				else {
					System.out.print("* ");
				}	
			}
			System.out.println();
		}
		
		
		//打印一个三角形3
		System.out.println("打印一个三角形3：");
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10-i; j++) {
				System.out.print(" ");
				}
			
			for (int j2 = 0; j2 < i*2-1; j2++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}
		
	}
	


