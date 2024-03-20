import javax.swing.SwingUtilities;

import speccheck.SpecCheck;

public class Runner
{
    public static void main(String args[]) {
        {

// GUI dialogs are used, so we need to run on the event thread.
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    SpecCheck.testAndZip(mini3.SpecChecker.class, "MINI_3_SUBMISSION","mini3", new String[]{"src/mini3/MazeExplorer.java"});
                }
            });
        }
    }
}