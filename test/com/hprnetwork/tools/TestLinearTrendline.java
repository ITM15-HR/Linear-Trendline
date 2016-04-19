package com.hprnetwork.tools;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestLinearTrendline {

	List<PointFloat> points = new ArrayList<PointFloat>();
	
	@Before
	public void setUp() throws Exception {
		points.add(new PointFloat(1, 50));
		points.add(new PointFloat(2, 10));
		points.add(new PointFloat(3, 20));
		points.add(new PointFloat(4, 60));
		points.add(new PointFloat(5, 60));
		points.add(new PointFloat(6, 50));
		points.add(new PointFloat(7, 80));
		points.add(new PointFloat(8, 10));
		points.add(new PointFloat(9, 20));
		points.add(new PointFloat(10, 40));
		points.add(new PointFloat(11, 20));
		points.add(new PointFloat(12, 35));
		points.add(new PointFloat(13, 30));
		points.add(new PointFloat(14, 20));
		points.add(new PointFloat(15, 30));
		points.add(new PointFloat(17, 40));
		points.add(new PointFloat(18, 30));

	}

	@Test
	public void test() {
		LinearTrendline linearTrendline = new LinearTrendline();
		List<PointFloat> linearTrenlinePoints = linearTrendline.calculateTrendline(points);
		for (PointFloat point : linearTrenlinePoints) {
			System.out.println(String.format("%f / %f", point.getX(), point.getY()));
		}
	}

}
