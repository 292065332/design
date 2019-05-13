package com.pagoda.design.structuralModel.composite.kill.leaf;

import com.pagoda.design.structuralModel.composite.kill.AbstractFile;

/**
 * 叶子构件 : 图形文件
 */
public class ImageFile implements AbstractFile {
	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void viewProperties() {
		System.out.println("---图像文件："+name+",查看属性！");
	}
	
}

