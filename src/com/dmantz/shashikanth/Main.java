package com.dmantz.shashikanth;

public class Main {
public static void main(String... args) {
	Factory factory_obj=new Factory();
	
	
	Shape rectangle_obj=factory_obj.getShape("Rectangle");
	rectangle_obj.draw();
	
	
	Shape square_obj=factory_obj.getShape("Square");
	square_obj.draw();
	
	
	Shape circle_obj=factory_obj.getShape("Circle");
    circle_obj.draw();
}
}
