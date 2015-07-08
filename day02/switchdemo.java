package day02;

import java.util.Scanner;

public class switchdemo {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
	int day=scanner.nextInt();
	String mondayString="";
	switch(day)
	{
		case 1:mondayString="monday";break;
		case 2:mondayString="tuesday";break;
		case 3:mondayString="wednesday";break;
		case 4:mondayString="thursday";break;
		case 5:mondayString="friday";break;
		case 6:mondayString="saturday";break;
		case 7:mondayString="sunday";break;
		default:mondayString="error day";
		}
	System.out.println(mondayString);
	}
}
