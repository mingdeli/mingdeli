package day03;

class Phone{
	String name;
	String brand;
	int price;
	
	void call(){
		System.out.println("打电话……");
	}
	void sendMsg(){
		System.out.println("发信息……");
	}
	
	public static void main(String[] args){
		Phone p=new Phone();
		
		p.name="note";
		p.brand="baomihua";
		p.price=99;
		
		System.out.println(p.name);
		p.sendMsg();
	}
}




