package day02;

//���100�����ܳ���3����
public class continued {
	public static void main(String[] args){
		
		for (int i = 0; i < 100; i++) {
			if(i%3==0)
				System.out.print(i+" ");
		}
		System.out.println("wwwwwww");
		
		
//���100���ڵ�����
		System.out.println("���100���ڵ�����");
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
		}System.out.println("����������Ϊ��"+sun+" ");	

	}
}
