package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	int cnfvb = new Random().nextInt(4);
	System.out.println(cnfvb);
	String v = JOptionPane.showInputDialog(" What is something that you think is awsome");
	if(cnfvb==0) {
	JOptionPane.showMessageDialog(null, v+ "  is sooooooooooooooooooooooooo AWSOME!!!!!!");
	}
	if(cnfvb==1) {
	JOptionPane.showMessageDialog(null, v+ "it is ok but it isn't the best");
	}
if(cnfvb==2) {
	JOptionPane.showMessageDialog(null, v+ "  suks so much. It is sad how you think that is awsome");
}
if(cnfvb==3) {
	JOptionPane.showMessageDialog(null, v+ " is so bad that everyone who hears that you think that is awesome will die of disbeleif");
}
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}


