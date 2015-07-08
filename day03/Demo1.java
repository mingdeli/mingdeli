package day03;

public class Demo1{
	//属性
	String name;
	String  brand;
	int price;
	//行为（方法）
	void call(){
		System.out.println("打电话，，，");	
	}
	void sendM(){
		System.out.println("发信息，，，");	
	}
	void clock(){
		System.out.println("闹钟，，，");	
	}
	//实例化
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