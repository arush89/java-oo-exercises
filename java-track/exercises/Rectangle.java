
public class Rectangle {

	private int length;
	private int width;
	private Rectangle area;

	// write constructor
	public Rectangle(int length, int width) {
	}

	public int getlength() {
		return this.length;
	}

	public int getwidth() {
		return this.width;
	}

	public int getArea() {
		return this.length * this.width;

	}

	public int pre() {
		return 2 * (this.length + this.width);
	}

	public void Islarger(Rectangle bigarea) {

		if (this.getArea() > bigarea.getArea())
			System.out.print("The rectangle is bigger");

		else
			System.out.print("The rectangle is smaller");

	}
	public void Isnotsquare() {
	
		if ( length ==  width)
			System.out.print("This is a rectangle");
		else 
			System.out.print("This is a square");
	}
	

	public String toString() {
		return "length :" + this.length + "width :" + this.width + "Rectangle area :" + this.area;
	}

	public static void main(String args [])
	{
		Rectangle my_rectangle = new Rectangle(4,5);
		System.out.println(my_rectangle.getwidth());
		System.out.println(my_rectangle);

}
}
