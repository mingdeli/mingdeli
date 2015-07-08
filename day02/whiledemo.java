package day02;

public class whiledemo {
public static void main(String[] args){
	System.out.println(1);
	System.out.println(2);
	int i=1;
	while(i<=100){
		System.out.print(i+" ");
		i++;
	}
	System.out.println();
	System.out.println("exit since the i was "+i);
	
//使用do-while;
    i=1;
	do{
		System.out.println(i+" ");
		i++;
	}while(i<=10);
	
//for循环；
	System.out.println("for循环：");
	for(i=0;i<=10;i++){
		System.out.print(i+" ");
	}	
}
}
