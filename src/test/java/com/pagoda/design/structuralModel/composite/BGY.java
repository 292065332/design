package com.pagoda.design.structuralModel.composite;

import java.util.function.Supplier;

public abstract class BGY {

	String name;

	public abstract void add(BGY bgy);

	public abstract void remove(BGY bgy);

	/**
	 * 活动
	 */
	public abstract void activity(Supplier s);

}