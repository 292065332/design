package com.pagoda.design.structuralModel.composite.demo;

//容器组件
interface Composite extends Component {
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}