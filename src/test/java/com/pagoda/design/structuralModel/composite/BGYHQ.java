package com.pagoda.design.structuralModel.composite;

import org.assertj.core.util.Lists;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author JiangWJ
 * @date 2019/5/9 
 * @description 百果园总部
 */
public class BGYHQ extends BGY{

	private List<BGY> joinList = Lists.newArrayList();

	public BGYHQ(String name) {
		this.name = name;
	}

	@Override
	public void add(BGY bgy) {
		joinList.add(bgy);
	}

	@Override
	public void remove(BGY bgy) {
		joinList.remove(bgy);
	}

	@Override
	public void activity(Supplier s) {
		s.get();
	}
}
