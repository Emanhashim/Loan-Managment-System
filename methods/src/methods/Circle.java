package methods;

public class Circle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		SimpleCircle c1 = new SimpleCircle();
		System.out.println("the area of the radius" + c1.radius + "is" + c1.getArea());
		
		SimpleCircle c2 = new SimpleCircle(25);
		System.out.println("the area of circle radius is" + c2.radius + "is" + c2.getArea());
		
		SimpleCircle c3 = new SimpleCircle(125);
		System.out.println("the area of circle radius is" + c3.radius + "is" + c3.getArea());
		
		SimpleCircle c4 = new SimpleCircle (567);
		System.out.println("the area of circle radius is" + c4.radius + "is" + c4.getArea());
		
		c2.radius = 100;
		System.out.println("the araea is " + c2.radius + "is " + c2.getArea());
		
		
		}
		
	}

	
	class SimpleCircle{
	double radius;
	
	
	 SimpleCircle(){
		radius = 1;
	}
	
	SimpleCircle(double newRadius){
		 radius = newRadius;
		
	}
	 
	 double getArea() {
		 return radius* radius *Math.PI;
	 }
	 double getPerimeter() {
		 return 2* radius* radius *Math.PI;
	 }
         
	 void setRadius(double newRadius) {
		 radius = newRadius;
		 
	 }
	
}

