/**
 * 
 */

/**
 * @author Freyshyn
 *
 */
public abstract class abstractFigure implements interfaceFigure {
	private int x_=0;//coordinats
	private int y_=0;
	public abstractFigure(int x,int y){
		x_=x;
		y_=y;
	}
	/*
	 * 
	 */
	public void setX(int x){
		x_=x;
	}
	public void setY(int y){
		y_=y;
	}
   /*
    * 
    */
	public int getX(){
		return x_;
	}
	public int getY(){
		return y_;
	}
}
