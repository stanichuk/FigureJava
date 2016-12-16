import java.util.ArrayList;
import java.util.List;

public class main {
	
	public static void showFigure(List<interfaceFigure> list)
	{
		for(interfaceFigure inter:list)
			inter.paintFigure();
	}
	public static double getSumPerimeter(List<interfaceFigure> list){
		double rez=0;
		for(interfaceFigure inter:list)
			rez +=inter.getPerimeter();
		return rez;
	}
	public static double getMaxArea(List<interfaceFigure> list){
		double max=0;
		for(interfaceFigure inter:list){
			if(max<inter.getArea())
				max =inter.getArea();
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello!\n");
		List<interfaceFigure>listFigure = new ArrayList<interfaceFigure>();
		for(int i=0;i<6;i++){
			if(i%2==0)
				listFigure.add(new Circle(i, i+1, i+1));
			else
				listFigure.add(new Rectangle(i+1, i, 2+i, i+1));
		}
		System.out.print("Show all figure\n");
		showFigure(listFigure);
		System.out.print("Sum peremiter of all figure: "+getSumPerimeter(listFigure)+"\n");
		System.out.print("Maximum area figure: "+getMaxArea(listFigure)+"\n");
	}
}
