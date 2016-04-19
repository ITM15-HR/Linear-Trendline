package com.hprnetwork.tools;

import java.util.ArrayList;
import java.util.List;

public class LinearTrendline {

	public LinearTrendline() {
		
	}
	
    //iteration over points can be enhanced by calculation different sums at once
    
	private float sumX(List<PointFloat> points) {
		float sum = 0;
		for (PointFloat point : points) {
			sum += point.getX();
		}
		return sum;
	}
	
	private float sumY(List<PointFloat> points) {
		float sum = 0;
		for (PointFloat point : points) {
			sum += point.getY();
		}
		return sum;
	}
	
	private float sumSquartedX(List<PointFloat> points) {
		float sum = 0;
		for (PointFloat point : points) {
			sum += (point.getX() * point.getX());
		}
		return sum;
	}
	
	private float sumXByY(List<PointFloat> points) {
		float sum = 0;
		for (PointFloat point : points) {
			sum += point.getX() * point.getY();
		}
		return sum;
	}
	
	public List<PointFloat> calculateTrendline(List<PointFloat> points) {
		if (points == null)
			throw new IllegalArgumentException();
		
		List<PointFloat> linearTrendPoints = new ArrayList<PointFloat>();
		
		float sX = sumX(points);
		float sY = sumY(points);
		
		float a = points.size() * sumXByY(points);
		float b = sX * sY;
		float c = points.size() * sumSquartedX(points);
		float d = sX * sX;
		float slope = (a - b) / (c - d);
		
		float e = sY;
		float f = slope *  sX;
		float yIntercept = (e - f) / points.size();
		
		for (PointFloat point : points) {
			float y = slope*point.getX() + yIntercept;
			linearTrendPoints.add(new PointFloat(point.getX(), y));
		}
		
		return linearTrendPoints;
	}

}
