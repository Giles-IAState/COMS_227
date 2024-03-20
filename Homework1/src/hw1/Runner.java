import javax.swing.SwingUtilities;

import speccheck.SpecCheck;

public class Runner
{
    public static void main(String args[]) {
        {

// GUI dialogs are used, so we need to run on the event thread.
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    SpecCheck.testAndZip(hw1.SpecChecker.class, "HW_1_SUBMISSION","hw1", new String[]{"src/hw1/AirportVan.java"});
                }
            });
        }
    }
}