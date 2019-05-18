package com.pagoda.design.behavioralModel.order;

/**
 * 关闭电灯命令
 */
public class LightOffCommond implements Command {
    private Light light;

    public LightOffCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}