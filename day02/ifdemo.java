package day02;

import java.util.Scanner;

public class ifdemo {
public static void main(String[] args){
	boolean studyHard=false;
	if(studyHard){
		System.out.println("pass the exam");
	}
	else 
	{
		System.out.println("fail the exam.");
		System.out.println("work harder!");
	}
	
	
	//����ѧ���ķ��������ֵȼ�
Scanner scanner = new Scanner(System.in);
int score = scanner.nextInt();//��������

if (score>=90) {
	System.out.println("rank A");	
}
else if(score>=80) {
	System.out.println("rank B");
}
else if(score>=70){
	System.out.println("rank C");
}
else if (score>=60){
	System.out.println("rank D");
}
else{
	System.out.println("rank E");
}
}	
}
