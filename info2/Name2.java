//protected example
package info2;
import info.*;
class Name2 extends Name{//new class derived from base class (extend uses)
		  private int graduationYear = 2018;
		  public static void main(String[] args) {
		  Name2 myObj = new Name2();
		    System.out.println("Name: " + myObj.firstname + " " + myObj.lastname);
		    System.out.println("Email: " + myObj.email);
		    System.out.println("Age: " + myObj.age);
		    System.out.println("Graduation Year: " + myObj.graduationYear);
}
}
//a protected can be accesed in a package and non subclass