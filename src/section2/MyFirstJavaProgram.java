package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot ccdog = new Robot("batman");
	ccdog.penDown();
	ccdog.move(100);
	ccdog.sparkle();
	ccdog.turn(90);
	ccdog.setSpeed(100);
	ccdog.move(100);	
	ccdog.turn(90);
	ccdog.move(100);
	ccdog.turn(90);
	ccdog.move(100);
	ccdog.penUp();
	ccdog.move(40);
	ccdog.turn(90);
	ccdog.move(30);
	for(int i=0;i<4;i++) {
		ccdog.penDown();
		ccdog.move(100);
		ccdog.sparkle();
		ccdog.turn(90);
		ccdog.setSpeed(100);
		ccdog.move(100);	
		ccdog.turn(90);
		ccdog.move(100);
		ccdog.turn(90);
		ccdog.move(100);
		ccdog.penUp();
		ccdog.move(40);
		ccdog.turn(90);
		ccdog.move(30);
	}}}
