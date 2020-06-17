package com.behavioraltype.command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();

        Command onCommand = new LightOnCommand(lightReceiver);
        Command offCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,onCommand,offCommand);

        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWashPushed();

        //电视机的开关
        TVReceiver tvReceiver = new TVReceiver();

        Command tvOnCommand = new TVOnCommand(tvReceiver);
        Command tvOffCommand = new TVOffCommand(tvReceiver);

        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWashPushed();



    }
}
