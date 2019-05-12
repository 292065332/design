package com.pagoda.design.structuralModel.flyweight;

/**
 * 享元类
 * @author Administrator
 *
 */
public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}



