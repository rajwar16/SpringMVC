package com.bridgeit.propertyPlaceholderConfig;

public class Circle implements Shape{

	private Point circle;

	public Point getCircle() {
		return circle;
	}

	public void setCircle(Point circle) {
		this.circle = circle;
	}

	public void draw() {
		System.out.println("Drawing The Circle....");
		System.out.println("point("+getCircle().getPonitX()+","+getCircle().getPointY()+")");
	}
	

	
	
}
