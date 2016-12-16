
public class Rectangle extends abstractFigure  {
private int heigth_=0;
private int weigth_=0;
	public Rectangle(int x, int y) {
		super(x, y);
	}
	public Rectangle(int x, int y,int heigth,int weigth) {
		super(x, y);
		heigth_=heigth;
		weigth_=weigth;
	}
	@Override
	public double getPerimeter() {
		return 2*(heigth_+weigth_);
	}

	@Override
	public double getArea() {
		return heigth_*weigth_;
	}
	@Override
	public void paintFigure() {
		int n=heigth_+getX();
		int n2=weigth_+getY();
		for(int i=0;i<n;i++){
			for(int j=0;j<n2;j++){
				if(i>=getX() && j>=getY())
					System.out.print("* ");
				else 
					System.out.print(". ");
			}
			System.out.println();
		} 
	}

}
