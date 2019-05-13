package com.pagoda.design.structuralModel.composite.kill;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件 : 文件夹
 */
class Folder implements AbstractFile {
	private String name;
	//定义容器，用来存放本容器构建下的子节点
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}

	public void add(AbstractFile file){
		list.add(file);
	}
	public void remove(AbstractFile file){
		list.remove(file);
	}
	public AbstractFile getChild(int index){
		return list.get(index);
	}

	@Override
	public void viewProperties() {
		System.out.println("---文件夹："+name+",查看属性! ");
		
		for (AbstractFile file : list) {
			file.viewProperties();
		}
		
	}
}

