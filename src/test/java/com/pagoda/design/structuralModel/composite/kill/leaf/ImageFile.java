package com.pagoda.design.structuralModel.composite.kill.leaf;

import com.pagoda.design.structuralModel.composite.kill.AbstractFile;

public class ImageFile implements AbstractFile {
	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---图像文件："+name+",进行查杀！");
	}
	
}