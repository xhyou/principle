package com.behavioraltype.command;

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;

    //撤销
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            //初始的时候 什么都不执行
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下打开按钮
    public void onButtonWasPushed(int no) {
        onCommands[no].execute();
        //记录这次操作,用于撤销
        undoCommand = onCommands[no];
    }

    //按下关闭按钮
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        //记录这次操作,用于撤销
        undoCommand = offCommands[no];
    }

    //按下撤销按钮
    public void undoButtonWashPushed(){
        undoCommand.undo();
    }
}

