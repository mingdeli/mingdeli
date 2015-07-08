
package day03;
//多态的例子：父类的某一种类型在不同的子类中有不同的形态。
public class Fruit {
}

class Apple extends Fruit{
	public String toString(){
		return "pingguo";
	}
}

class Mango extends Fruit{
	public String toString(){
		return "芒果";
	}
}

class Juicer{
	public void juice(Fruit fruit){
		System.out.println("榨"+fruit+"果汁");
	}
	
	
	public static void main(String[] args){
		Juicer j = new Juicer();
		 Fruit fruit = new Apple();//若是new Mango(); 就会有不同的行为。
		 j.juice(fruit);
	}
}