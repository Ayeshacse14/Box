import java.util.*;

public class BoxMain {
	
	public static void main(String [] ayesha)
	{
		Scanner cin = new Scanner(System.in);
		
		double height,width,length;
		
		height = cin.nextDouble();
		
		width = cin.nextDouble();
		
		length = cin.nextDouble();
		
		Box obj = new Box(2.31,4.3,6.5);	
	
		
		System.out.println("Box Area is:" + obj.boxArea());
		
		
		obj.set_data(height, width, length);
		
		
		System.out.println("Box Area is:" + obj.boxArea());
		
		cin.close();
	}

}
