package hw4;

import api.ScoreBox;

/**
 * Score box that is satisfied by a Combination including
 * at least three dice of one value and two of a different value.
 * The score is the sum of all die values.
 * 
 * @author Cole Giles
 */
//TODO: this class must implement ScoreBox or extend another class that does
public class FullHouseScoreBox implements ScoreBox
{
  private String name;
  /**
   * Constructs a FullHouseScoreBox with the given display name.
   * @param displayName
   *   name for this score box
   */
  public FullHouseScoreBox(String displayName)
  {
    name = displayName;
  }

  public boolean isFilled() {return true;}

  public int getScore() {return 0;}

  public Combination getDice(){return null;}

  public String getDisplayName(){return name;}

  public void fill(Combination dice){}

  public boolean isSatisfiedBy(int[] arr) {return true;}

  public int getPotentialScore(int[] arr) {return 0;}
}
