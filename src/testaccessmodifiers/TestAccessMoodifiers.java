package testaccessmodifiers;
import accessmodifiers.AccessModifiers;

class Subclass extends AccessModifiers{
	
	void display() {
		System.out.println("Acceessing protected method");
		protectedModifier();
	}
}

public class TestAccessMoodifiers {
	
	public static void main(String[] args) {
		System.out.println("Accessing public method here from accessmodifiers package to testaccessmodifiers package");
		AccessModifiers pm1 =  new AccessModifiers ();
		pm1.show();
		//pm.privateDetails();--> We can  not access private method here  
		//pm1.defaultModifier();-->we can not access default method because it is package private means 
		//we can access default modifier only in the same package
		Subclass sc = new Subclass () ;
		sc.display();

	}

}
