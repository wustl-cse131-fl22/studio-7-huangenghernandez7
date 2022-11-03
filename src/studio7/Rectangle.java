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
			StdDraw.filledRectangle(0, 0, width/2, length/2);
		}
}
