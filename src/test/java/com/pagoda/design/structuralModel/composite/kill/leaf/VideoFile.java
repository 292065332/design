package com.pagoda.design.structuralModel.composite.kill.leaf;

import com.pagoda.design.structuralModel.composite.kill.AbstractFile;

public class VideoFile implements AbstractFile {
	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		System.out.println("---视频文件："+name+",进行查杀！");
	}
}
