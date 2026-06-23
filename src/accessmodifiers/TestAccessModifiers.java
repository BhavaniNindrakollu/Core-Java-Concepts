package accessmodifiers;
import accessmodifiers.AccessModifiers;

public class TestAccessModifiers {

	public static void main(String[] args) {
	System.out.println("Accessing public method here from AccessModifiers class to TestModifiers class");
	AccessModifiers pm =  new AccessModifiers ();
	pm.show();
	//pm.privateDetails();--> We can  not access private method here
	System.out.println("Accessing default method");
	pm.defaultModifier();//accessing default method
	System.out.println("Accessing protected method");
    pm.protectedModifier();
	
	}

}
