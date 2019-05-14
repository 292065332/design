package com.pagoda.design.structuralModel.flyweight;

import lombok.Data;

/**
 * 外部状态UnSharedConcreteFlyWeight
 * @author Administrator
 *
 */
@Data
public class Coordinate {
	private int x,y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
