package hw4;

import api.ScoreBox;

/**
 * Score box that is satisfied by any Combination.
 * The score is the sum of all die values.
 * 
 * @author Cole Giles
 */
//TODO: this class must implement ScoreBox or extend another class that does
public class ChanceScoreBox implements ScoreBox
{
  /**
   * Constructs a ChanceScoreBox with the given display name.
   * @param displayName
   *   name for this score box
   */
  public ChanceScoreBox(String displayName)
  {
    // TODO
  }

  @Override
  public boolean isFilled()
  {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public int getScore()
  {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public Combination getDice()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getDisplayName()
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void fill(Combination dice)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean isSatisfiedBy(int[] arr)
  {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public int getPotentialScore(int[] arr)
  {
    // TODO Auto-generated method stub
    return 0;
  }

}
