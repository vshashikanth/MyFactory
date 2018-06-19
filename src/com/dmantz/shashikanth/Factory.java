package com.dmantz.shashikanth;

public class Factory {
public Shape getShape(String shapetype) {
	if(shapetype==null) {
		return null;
		}
	if(shapetype.equalsIgnoreCase("RECTANGLE")) {
		return new Rectangle();
		}
	else if(shapetype.equalsIgnoreCase("SQUARE")) {
       return new Square();
        }
    else if(shapetype.equalsIgnoreCase("CIRCLE")) {
    	return new Circle();
        }
   return null;
}
}
