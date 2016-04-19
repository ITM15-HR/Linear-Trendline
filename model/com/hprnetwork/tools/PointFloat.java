package com.hprnetwork.tools;

public class PointFloat {

	private float x;
	private float y;
	
	public PointFloat() {
		
	}
	
	public PointFloat(float x, float y) {
		setX(x);
		setY(y);
	}
	
	public PointFloat(PointFloat pointFloat) {
		setX(pointFloat.x);
		setY(pointFloat.y);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	

}
