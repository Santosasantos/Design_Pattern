package Behavioural.command;

public class RedoCutPaste implements Command{
    private CutPaste cutPaste;
    public RedoCutPaste(CutPaste cutPaste){
        this.cutPaste=cutPaste;
    }
    public void execute(){
     cutPaste.redo();
    }
}
