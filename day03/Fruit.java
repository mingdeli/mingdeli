
package day03;
//��̬�����ӣ������ĳһ�������ڲ�ͬ���������в�ͬ����̬��
public class Fruit {
}

class Apple extends Fruit{
	public String toString(){
		return "pingguo";
	}
}

class Mango extends Fruit{
	public String toString(){
		return "â��";
	}
}

class Juicer{
	public void juice(Fruit fruit){
		System.out.println("ե"+fruit+"��֭");
	}
	
	
	public static void main(String[] args){
		Juicer j = new Juicer();
		 Fruit fruit = new Apple();//����new Mango(); �ͻ��в�ͬ����Ϊ��
		 j.juice(fruit);
	}
}