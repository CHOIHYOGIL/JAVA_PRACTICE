package Java_TextBook;

public class ch5_6 {

	public static void main(String[] args) {
		ColorPoint1 zeroPoint = new ColorPoint1();
		System.out.println(zeroPoint.toString()+"입니다.");
		
		ColorPoint1 cp= new ColorPoint1(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");

	}

}

class Point1 {
	private int x, y;
	public Point1(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint1 extends Point{
	
	private int x;
	private int y;
	private String color;
			
	public ColorPoint1(int x, int y) {
		super(x,y);
		
	}
	public ColorPoint1() {
		super(0,0);
		color="BLACK";
	}
	
	public String toString() {
		
		return color+"색의 "+"( "+x+","+y+" )"+"의 점";
	}
	
	public void setXY(int a, int b) {
		this.x=a;
		this.y=b;
	}
	public void setColor(String color) {
		this.color=color;
	}
}