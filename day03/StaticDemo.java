package day03;

public class StaticDemo {

	int age;
	
	void hello(){
		System.out.println("Hello......");
	}
	
	static void hi(){
		System.out.println("Hi.....");
	}
	
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
		s.hello();
		StaticDemo.hi();
		//�{���o�B��hi������������Ҫע����ǣ�����
		StaticDemo.hi();
	}

}
