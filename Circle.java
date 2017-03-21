//Juan Luna
//Objected-Oriented Programming
//Assignment #6 - Circle
//20 March 2017
public class Circle {
	double r;
public double getRadius(){
	
	return r;
	
}

public double getDiameter(){
	
	return r * 2;
	
}

public double getArea(){
	
	return Math.PI*(r*r);
	
}

public double getCircumference(){
	
	return 2*Math.PI*r;	
}
}
