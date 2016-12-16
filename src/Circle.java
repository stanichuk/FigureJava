/**
 * 
 */

/**
 * @author Freyshyn
 *
 */
public class Circle extends abstractFigure {
 private int rad_=0;
	public Circle(int x, int y) {
		super(x, y);
	}
	public Circle(int x, int y,int rad) {
		super(x, y);
		rad_=rad;
	}
	@Override
	public double getPerimeter() {
		return 2*rad_*3/14;
	}
	@Override
	public double getArea() {
		return 3.14*rad_*rad_;
	}
	@Override
	public void paintFigure() {
		int n=rad_+getX();
		int n2=rad_+getY();
		for (int i = -n; i <= rad_; i++) {
            for (int j = -n2; j <= rad_; j++) {
                if (i*i + j*j <= rad_*rad_) System.out.print("* ");
                else                  System.out.print(". ");
            }
            System.out.println();
        }

		
	}

}
