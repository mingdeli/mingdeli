package day02;

//输出100以内能除以3的数
public class continued {
	public static void main(String[] args){
		
		for (int i = 0; i < 100; i++) {
			if(i%3==0)
				System.out.print(i+" ");
		}
		System.out.println("wwwwwww");
		
		
//输出100以内的质数
		System.out.println("输出100以内的质数");
		int sun=0;
		for ( int k = 2; k <= 100; k++)
		{
			int flag=1;
			for (int j = 2; j <k; j++) 
			{
				if(k%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				sun+=1;
				System.out.print(k+" ");	
			}
		}System.out.println("质数的总数为："+sun+" ");	

	}
}
