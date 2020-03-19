package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	static Thread r1;
	static Thread r2;
	static Thread r3;
	static Thread r4;
	static Thread r5;
	static Thread r6;
	static Thread r7;
	static Thread r8;
	static Thread r9;
	static Thread r10;
	
	public static void main(String[] args) {
		Robot timmy = new Robot(800, 200);
		Robot tammy = new Robot(1100, 500);
		Robot sammy = new Robot(1400, 200);
		Robot greg = new Robot(200, 200);
		Robot robby = new Robot(500, 500);

		timmy.penDown();
		timmy.setPenColor(new Color(0,0,0));
		tammy.penDown();
		tammy.setPenColor(new Color(0,255,0));
		sammy.penDown();
		sammy.setPenColor(new Color(255,0,0));
		greg.penDown();
		greg.setPenColor(new Color(0,0,250));
		robby.penDown();
		robby.setPenColor(new Color(255,255,0));
		
		timmy.setSpeed(100);
		tammy.setSpeed(100);
		sammy.setSpeed(100);
		greg.setSpeed(100);
		robby.setSpeed(100);
			r1 = new Thread(()->{
				for (int i = 0; i <360; i++) {
				timmy.move(4);
			timmy.turn(360/360);
				}
			});
			r2 = new Thread(()->{
				for (int i = 0; i <360; i++) {
				tammy.move(4);
			tammy.turn(360/360);
				}
			});
			r3 = new Thread(()->{
				for (int i = 0; i <360; i++) {
				sammy.move(4);
			sammy.turn(360/360);
				}
			});
			r4 = new Thread(()->{
				for (int i = 0; i <360; i++) {
				greg.move(4);
			greg.turn(360/360);
				}
			});
			r5 = new Thread(()->{
				for (int i = 0; i <360; i++) {
				robby.move(4);
			robby.turn(360/360);
				}
			});
		
	
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
}
}

