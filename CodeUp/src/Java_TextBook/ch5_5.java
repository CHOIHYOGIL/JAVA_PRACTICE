package Java_TextBook;

public class ch5_5 {

	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str=cp.toString();
		
		System.out.println(str+"입니다.");

	}

}

class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point{
	
	private String Color;
	private int x,y;
	public ColorPoint(int a, int b, String Color) {
		super(a,b);
		this.Color=Color;
	}
	
	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setColor(String color) {
		this.Color=color;
	}
	public String toString() {
		
		String str=Color+"색의 "+"("+x+", "+y+" )"+"의 점";
		return str;
	}
	
	
	
}