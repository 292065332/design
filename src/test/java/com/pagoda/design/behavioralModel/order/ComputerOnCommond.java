package com.pagoda.design.behavioralModel.order;

/**
 * 打开电脑命令
 */
public class ComputerOnCommond implements Command
{  
    private Computer computer ;   
      
    public ComputerOnCommond( Computer computer)  
    {  
        this.computer = computer;  
    }  
  
    @Override  
    public void execute()  
    {  
        computer.on();  
    }  
  
}