package hw4;

import api.ScoreBox;

/**
 * Score box that is based on counting dice that match
 * a particular target value (as specified in the constructor).
 * This category is satisfied by any Combination.  The score
 * is the sum of the dice that match the target.
 * 
 * @author Cole Giles
 */
//TODO: this class must implement ScoreBox or extend another class that does
public class MatchTargetScoreBox implements ScoreBox
{
  private String name;
  private int value;

  /**
   * Constructs a MatchTargetScoreBox with the given display name and 
   * target value.
   * @param displayName
   *   name for this score box
   * @param whichValue
   *   target value that must be matched for the dice to count toward the
   *   score
   */
  public MatchTargetScoreBox(String displayName, int whichValue)
  {
    name = displayName;
    value = whichValue;
  }

  public boolean isFilled() {return true;}

  public int getScore() {return 0;}

  public Combination getDice(){return null;}

  public String getDisplayName(){return name;}

  public void fill(Combination dice){}

  public boolean isSatisfiedBy(int[] arr) {return true;}

  public int getPotentialScore(int[] arr) {

    int potentialScore = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == value) {
        potentialScore += value;
      }
    }
    return potentialScore;
  }

}
