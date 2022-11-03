package studio7;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		return this.length*this.width;
	}
	
	public double perimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public boolean square() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller(Rectangle y) {
		if (area() > y.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		String description = "Length: " + length + " Width: " + width;
		return description;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle x = new Rectangle(10, 15);
		Rectangle y = new Rectangle(11,14);
		System.out.println(x.area());
		System.out.println(y.area());
		System.out.println(x.perimeter());
		System.out.println(y.perimeter());
		System.out.println(x.square());
		System.out.println(y.square());
		System.out.println(x.isSmaller(y));
	}

}
