package hw4;

import javax.swing.SwingUtilities;

import speccheck.SpecCheck;

public class Runner {

    public static void main(String[] args)
    {
        {
            // GUI dialogs are used, so we need to run on the event thread.
            SwingUtilities.invokeLater( new Runnable()
            {
                public void run()
                {
                    SpecCheck.testAndZip(
                            SpecChecker.class,
                            "SUBMIT_THIS_hw4",
                            "hw4",
                            new String[]{"src/hw4/AllMatchScoreBox.java", "src/hw4/CastleScoreBox.java", "src/hw4/ChanceScoreBox.java",
                                    "src/hw4/Combination.java", "src/hw4/FullHouseScoreBox.java", "src/hw4/LargeStraightScoreBox.java",
                                    "src/hw4/MatchTargetScoreBox.java", "src/hw4/MaxiYatzy.java", "src/hw4/NOfAKindScoreBox.java",
                                    "src/hw4/ShortStraightScoreBox.java", "TowerScoreBox.java", "src/hw4/TwoPairsScoreBox.java"}
                    );
                }
            });
        }
    }
}
