package Behavioural.command;

public class UndoCutPaste implements Command{
    private CutPaste cutPaste;

    public UndoCutPaste(CutPaste cutPaste){
        this.cutPaste=cutPaste;
    }
    public void execute(){
    cutPaste.undo();
    }
}
