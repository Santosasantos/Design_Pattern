package Behavioural.command;

public class CommandPatternTest {
    public static void main(String[] args) {
        CutPaste cutPaste=new CutPaste();
        Command redo=new RedoCutPaste(cutPaste);
        Command undo=new UndoCutPaste(cutPaste);
        CommandInvoker cmdinvoke=new CommandInvoker(redo);
        cmdinvoke.invoke();
        System.out.println("After some moments\n");
        cmdinvoke=new CommandInvoker(undo);
        cmdinvoke.invoke();
    }
}
