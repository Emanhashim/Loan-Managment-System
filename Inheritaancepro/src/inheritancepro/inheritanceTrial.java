package inheritancepro;



public class inheritanceTrial {
	
	public class Geo{
		private String color ="white";
		private boolean filled;
		private java.util.Date dateCreated;


	public Geo() {
		dateCreated = new java.util.Date();
	}

	public Geo(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	 public void setColor(String color) {
		 this.color= color;
	 }

	public boolean isFilled() {// cause its boolean the get method replaced by its own type
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
		}

	public java.util.Date getDateCreated(){ //this is the get date method as well
		 return dateCreated;
	}
	public String toString() {// this return the string representation of the objects
		return "created on" + dateCreated + "\n color is: " + color + "and filled" + filled;
		}
	}


	//----------------------------------//


	public class Circle extends Geo{
		private double radius;
		
		public Circle () {
			
		}
		
		public circle( double radius) {
			this.radius = radius;
			}
		public circle(double radius, String color, boolean filled) {// this called overload
			super(color,filled);// constructor call from super class
			this .radius = radius;
			
			}
		public  double getRadius() {
			return radius;
		}
		
		public void setRadius(double radius) {
			this.radius = radius;
		}
		public double getArea() {
			 return radius*radius*Math.PI;
			}
		public double getDiameter() {
			return radius*2 ;
		}
		public double getPerimetrer() {
			return 2* radius *Math.PI;
		}
		public void printCircle() {
			System.out.println("the circle is created on" +getDateCreated() + "the radius is" + radius );
		}
	}

	//-----------------------//

	public class Rec extends Geo{
		
		private double width;
		private double height;
		
		public Rec () {}
		
		public Rec(double width, double height) {
			this.height = height;
			this.width= width;
			}
		public Rec(double width, double height, String color, boolean filled) {
			super(color, filled);
			this.height = height;
			this.width = width;
		
			}
		public  double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
	public double getArea() {
		return height * width;
	}	

	public double getPerimeter() {
		return 2 * (width*height);
	}
		
	}

		//------------------------------//
		


	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		System.out.println("A circle is " + c1.toString());
		System.out.println("the radius is" + c1.getRadius());
		System.out.println("the dia is" + c1.getDiameter());
		System.out.println("the peri" + c1.getPerimetrer());
		
		Rec r1 = new Rec(2,5);
		System.out.println("the rec is"+ r1.toString());
		System.out.println("the peri" + r1.getPerimeter());
		System.out.println("the rec area" + r1.getArea());

	}

}

