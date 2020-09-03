package Java_TextBook;

public class ch5_7 {

	public static void main(String[] args) {
	PositivePoint p=new PositivePoint();
	p.move(10,10);
	
	System.out.println(p.toString()+"입니다.");
	
	p.move(-5,5);
	System.out.println(p.toString()+"입니다.");

	}

}

class Point2 {
	private int x, y;
	public Point2(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class PositivePoint extends Point{
	
	private int x;
	private int y;

			
	public PositivePoint() {
	
		super(0,0);
	}
	public PositivePoint(int x, int y) {
		super(x, y);
		if(x<0 || y<0)
			move(0,0);
		else
			return;
	}



	protected void move(int x, int y) { 
		if(x<0 || y<0)
			return;
		else
			super.move(x, y);
		}	



	public String toString() {
		
		return "("+getX()+", "+getY()+" )"+"의 점";
	}

}