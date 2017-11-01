
public class Box {
	
	private double height,width,length;
	
	Box(double h,double w,double l)
	{
		height = h;
		width = w;
		length = l;
	}
	
	
	void set_data(double h,double w,double l)
	{
		height = h;
		width = w;
		length = l;
	}
	
	
	double boxArea()
	{
		return height*width*length;
	}

}
