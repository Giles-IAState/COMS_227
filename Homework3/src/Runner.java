import javax.swing.SwingUtilities;

import speccheck.SpecCheck;

public class Runner
{
    public static void main(String args[]) {
        {

// GUI dialogs are used, so we need to run on the event thread.
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    SpecCheck.testAndZip(hw3.SpecChecker.class, "HW_3_SUBMISSION","hw3", new String[]{"src/hw3/AlphabetSoup.java","src/hw3/AlphabetUtil.java"});
                }
            });
        }
    }
}