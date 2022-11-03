package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

		private double length;
		private double width;
		
		public Rectangle() {
			this.length = 0;
			this.width = 0;
		}
		
		public Rectangle(double length, double width) {
			this.length = length;
			this.width = width;
		}
		
		public double getArea() {
			return(length*width);
		}
		
		public double getPerimeter() {
			return((2*length)+(2*width));
		}
		
		public boolean smallerRectangle(Rectangle r1) {
			if(r1.getArea() > this.getArea()) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public boolean isSquare() {
			if(length == width) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public void drawShape() {
			StdDraw.filledRectangle(0.5, 0.5, width/2, length/2);
		}
		
		public static void main (String args[]) {
			Rectangle r1 = new Rectangle(0.2, 0.3);
			Rectangle r2 = new Rectangle(8, 15);
			Rectangle r3 = new Rectangle(8, 8);
			
			System.out.println("Area: " + r1.getArea());
			System.out.println("Perimeter: " + r1.getPerimeter());
			System.out.println("Smaller Than: " + r1.smallerRectangle(r2));
			System.out.println("isSquare: " + r1.isSquare());
			System.out.println("isSquare (true): " + r3.isSquare());
			r1.drawShape();
			
		}
}
