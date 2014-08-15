import java.util.ArrayList;
import java.util.List;

class Animal {
}

class Dog extends Animal {
}

public class Teste {
	{
		List<? super Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
//		dogs.add(new Animal());

	}
	static {
		System.out.println("1");
	}
	static {
		System.out.println("2");
	}
	public static void main(String[] args) {
		
	}
}