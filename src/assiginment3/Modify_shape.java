package assiginment3;

import java.util.Scanner;

import assiginment3.Rectangle.Area_calc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Shape {

	int length;
	int breadth;
	int height;

	private void calculateArea() {

		System.out.println("Area of shapes");
	}

}

class Rectangle extends Shape {

	public Rectangle(int length, int breadth, int height) {

		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	class Area_calc {

		public double calculateArea(int length, int breadth) {

			class Formula {

				public double area(int length, int breadth) {

					return length * breadth;
				}

			}
			Formula f = new Formula();
			return f.area(length, breadth);
		}
	}
	
	
	
	static double area;

	public static class addArea {
		static int length;
		static int breadth;

		 public addArea(int length,int breadth) {
			this.length = length;
			this.breadth = breadth;
			add_area(this.length,this.breadth);
			
		}
		 
		
		

		public static double add_area(int length,int breadth) {
			

			return length*breadth;

		}
	}

}

class Triangle extends Shape {

	public Triangle(int base, int height, int length) {

		this.breadth = base;
		this.height = height;
		this.length = length;

	}

	class Area_calc {

		public double calculateArea(int height, int breadth) {

			class Formula {

				public double area(int height, int breadth) {

					return (height * breadth) / 2;
				}

			}
			Formula f = new Formula();
			return f.area(height, breadth);

		}
	}
	
	static double area;

	public static class addArea {
		static int length;
		static int breadth;
		static int height;

		 public addArea(int height,int breadth) {
			this.height = height;
			this.breadth = breadth;
			add_area(this.height,this.breadth);
			
		}
		 
		
		

		public static double add_area(int height,int breadth) {
			

			return (height*breadth)/2;

		}
	}
	
	
	
	

}

class Square extends Shape {

	public Square(int length, int breadth, int height) {

		this.length = length;
		this.breadth = breadth;
		this.height = height;

	}

	class Area_calc {

		public double calculateArea(int length, int breadth) {

			class Formula {

				public double area(int length, int breadth) {

					return length * breadth;
				}

			}
			Formula f = new Formula();
			return f.area(length, breadth);

		}

	}

	static double area;

	public static class addArea {
		static int length;
		static int breadth;
		static int height;

		 public addArea(int length,int breadth) {
			this.height = length;
			this.breadth = breadth;
			add_area(this.length,this.breadth);
			
		}
		 
		
		

		public static double add_area(int length,int breadth) {
			

			return (height*length);

		}
	}
	


}

class calculateArea extends Shape {

	String shape;

	public calculateArea(String shape, int length, int breadth, int height) {
		this.shape = shape;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		Rectangle.Area_calc r = new Rectangle(this.length, this.breadth, this.height).new Area_calc();
		Triangle.Area_calc t = new Triangle(this.length, this.breadth, this.height).new Area_calc();
		Square.Area_calc s = new Square(this.length, this.breadth, this.height).new Area_calc();

		String rec = "Rectangle";
		String tri = "Triangle";
		String sq = "Square";

		if (shape.equals(rec)) {
			System.out.println(" area of " + this.shape + " is = " + r.calculateArea(this.length, this.breadth));
		}

		else if (shape.equals(tri)) {

			System.out.println("area of " + this.shape + " is = " + t.calculateArea(this.height, this.breadth));

		} else if (shape.equals(sq)) {

			if (this.length == this.breadth & this.breadth == this.height) {
				System.out.println("area of " + this.shape + " is = " + s.calculateArea(this.length, this.breadth));
			} else {
				System.out.println("give the correct dimentions");
			}
		}

		else {
			System.out.println("no shape found");
		}

	}
}

public class Modify_shape {

	public static void main(String[] args) {

		String rec = "Rectangle";
		String tri = "Triangle";
		String sq = "Square";
		List r = new ArrayList();
		List t = new ArrayList();
		List s = new ArrayList();
		

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the shape: either Rectangle/Triangle/Square (Case sensitive)");
			String shape = sc.next();

			System.out.println("Enter the length:");
			int lenght = sc.nextInt();

			System.out.println("Enter the breadth(consider base for triangle):");
			int breadth = sc.nextInt();

			System.out.println("Enter the height:");
			int height = sc.nextInt();

			calculateArea ca = new calculateArea(shape, lenght, breadth, height);
			if(shape.equals(rec)) {
			Rectangle.addArea ra = new Rectangle.addArea(lenght,breadth);
			r.add(ra.add_area(lenght, breadth));
			}
			else if (shape.equals(tri)) {
			Triangle.addArea ta = new Triangle.addArea(height, breadth);
			t.add(ta.add_area(height, breadth));
			}
			else if(shape.equals(sq)) {
			Square.addArea sa = new Square.addArea(lenght, breadth);
			s.add(sa.add_area(lenght, breadth));
			}
			
			
			System.out.println("Do you want to add more amount, enter yes|no (case sensitive)");
			String opn = sc.next();
			String y = "yes";

			if (opn.equals(y)) {

				continue;

			}

			else {

				break;

			}

		}
		
		double r1 = 0;
		double t1 = 0;
		double s1 = 0;
		
		
		for(int i = 0; i < r.size() ; i++) {
			
			r1 += (double) r.get(i);	
		}
		for(int i = 0; i < t.size() ; i++) {
			
			t1 += (double) t.get(i);	
		}
		for(int i = 0; i < s.size() ; i++) {
			
			s1 += (double) s.get(i);	
		}
		
		System.out.println("sum of area of rectangle added  = "+r1);
		System.out.println("sum of area of triangle added  = "+t1);
		System.out.println("sum of area of square added  = "+s1);
	}

}


