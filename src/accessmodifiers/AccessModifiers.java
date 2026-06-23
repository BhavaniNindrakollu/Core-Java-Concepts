package accessmodifiers;


public class AccessModifiers {
	
	//1.We can write "public" for methods,classes,variables which means to access every
	// where (within the class,out of the class,package also out of the package class and sub classes)
	
	public String devRole = "JavaDeveloper";
	public String devName = "Bhavani";
	
	private int devAge = 20;
	private long devMobileNo =7000000000L;
	
	String eMail = "durga123@gmail.com";
	
	protected int devPincode = 342521;
	
	public void show() {
		System.out.println("Developer public details");
		System.out.println("Developer role in the company: "+devRole);
		System.out.println("Developer name in the company: "+devName);
		
	}
	
	//2. "private" access modifier is used for keeping the data is private
	// We can not create the class is private 
	//We can not access private members in another class or package
	//We can only access within the class
	
	private void privateDetails() {
		System.out.println("Developer private details");
		System.out.println("Developer age in the company: "+devAge);
		System.out.println("Developer Mobile number in the company: "+devMobileNo);
	}
	
	//3."default" access modifier can be use in the entire package like same class or differentt package
	// If we did not give any access modifier by default java takes "default" modifier
	
	void defaultModifier() {

		System.out.println("Developer email id: "+eMail);
	}
	// 4."protected" modifier is almost as "default" modifier but protected modifier 
	// but protected modifier can be accessible in sub class of another package
	
	protected void protectedModifier() {
		System.out.println("Developer pin code is: "+devPincode);
	}
	public static void main(String[] args) {
		
		AccessModifiers pm = new AccessModifiers();
		pm.show();
		pm.privateDetails();
		pm.defaultModifier();
		pm.protectedModifier();

	}

}
