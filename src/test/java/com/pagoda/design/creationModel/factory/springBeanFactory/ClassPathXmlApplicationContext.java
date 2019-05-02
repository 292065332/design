package com.pagoda.design.creationModel.factory.springBeanFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


/**
 * 然后建立一个BeanFactory的实现类ClassPathXmlApplicationContext.java
 */

public class ClassPathXmlApplicationContext implements BeanFactory {
    private Map<String, Object> beans = new HashMap<String, Object>();
    public ClassPathXmlApplicationContext(String fileName) throws Exception{
        SAXReader reader = new SAXReader();
        Document document = reader.read(this.getClass().getClassLoader().getResourceAsStream(fileName));
        List<Node> elements = document.selectNodes("/beans/bean");
        for (Node node : elements) {
            Element e = (Element) node;
            String id = e.attributeValue("id");
            String value = e.attributeValue("class");
            Object o = Class.forName(value).newInstance();
            beans.put(id, o);
        }
    }
    
    public Object getBean(String id) {
        return beans.get(id);
    }

}