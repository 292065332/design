package com.pagoda.design.structuralModel.composite.kill.leaf;

import com.pagoda.design.structuralModel.composite.kill.AbstractFile;

public class TextFile implements AbstractFile {
	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		System.out.println("---文本文件："+name+",进行查杀！");
	}
}