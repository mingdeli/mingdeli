package day03;

public class Demo1{
	//����
	String name;
	String  brand;
	int price;
	//��Ϊ��������
	void call(){
		System.out.println("��绰������");	
	}
	void sendM(){
		System.out.println("����Ϣ������");	
	}
	void clock(){
		System.out.println("���ӣ�����");	
	}
	//ʵ����
	public static void main(String[] args){
		Demo1 p=new Demo1();
		p.name="honor";
		p.brand="HuaWei";
		p.price=999;
		
		System.out.println(p.name+"\n"+p.brand+"\n"+p.price);
		p.call();
		p.sendM();
		p.clock();
	}
	
}