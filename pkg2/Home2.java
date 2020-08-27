//default example
package pkg2;

import pkg1.*;

public class Home2 {
	public static void main(String args[]) {
		Home2 obj = new Home2();// Shows error
		obj.msg();// Shows error
		// msg cannot be accessed bcoz we used default access specifier
	}
}
