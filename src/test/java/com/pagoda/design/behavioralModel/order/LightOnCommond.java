package com.pagoda.design.behavioralModel.order;


/**
 * 打开电灯命令
 */
public class LightOnCommond implements Command
{  
    private Light light ;   
      
    public LightOnCommond(Light light)  
    {  
        this.light = light;  
    }  
  
    @Override  
    public void execute()  
    {  
        light.on();  
    }  
  
} 