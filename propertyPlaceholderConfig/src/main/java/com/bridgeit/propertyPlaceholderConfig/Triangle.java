package com.bridgeit.propertyPlaceholderConfig;

public class Triangle implements Shape{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw()
	{
		System.out.println("point A ("+getPointA().getPonitX()+" , "+getPointA().getPointY()+")");
		System.out.println("point B ("+getPointB().getPonitX()+" , "+getPointB().getPointY()+")");
		System.out.println("point C ("+getPointC().getPonitX()+" , "+getPointC().getPointY()+")");
	}
}