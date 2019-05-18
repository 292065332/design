package com.pagoda.design.behavioralModel.order;

/**
 * 控制器面板，一共有9个按钮 
 *  
 * @author JiangWJ
 *  
 */
public class ControlPanel {
    private static final int CONTROL_SIZE = 9;
    private Command[] commands;

    public ControlPanel() {
        commands = new Command[CONTROL_SIZE];
        //初始化所有按钮指向空对象
        for (int i = 0; i < CONTROL_SIZE; i++) {
            commands[i] = new NoCommand();
        }
    }

    // 设置每个按钮对应的命令
    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    // 模拟点击按钮
    public void keyPressed(int index) {
        commands[index].execute();
    }

}  