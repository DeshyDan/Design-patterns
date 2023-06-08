package CommandPattern.Editor;

public interface UndoableCommand extends Command {
  void unexecute();
    
}
