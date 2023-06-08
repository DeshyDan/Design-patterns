package CommandPattern.com.Editor;

public interface UndoableCommand extends Command {
  void unexecute();
    
}
