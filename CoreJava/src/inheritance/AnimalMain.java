package inheritance;

class Animal {
	final String name;
	Animal(String name){
		this.name=name;
	}
	void sound() {
		System.out.println("sound");
	}
	void eat() {
		System.out.println("eating");
	}
}
class Cat extends Animal {
	Cat(String name){
		super(name);		
	}
	void sound(String soundName) {
		System.out.println(super.name+" sound is Meow");
	}
	void eat() {
		System.out.println("CAT eating");
	}
}
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Cat c1 =new Cat("CAT");
           c1.sound();
           c1.sound("MEOW");
           c1.eat();
	}

}
