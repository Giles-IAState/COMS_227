  package hw4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Group of dice for a dice game such as MaxiYatzy in which 
 * multiple rolls per turn are allowed.  The dice are partitioned
 * into "available" dice and "complete" dice.  The available
 * dice can be re-rolled (that is, they can get new values via the
 * <code>update</code> method). The client can select which dice 
 * to move from available to complete.
 * Once all dice are complete, as determined
 * by the <code>isComplete()</code> method, the <code>getAvailable()</code>
 * method always returns an empty array, and the state of the
 * combination can no longer be modified.
 * 
 * @author Cole Giles
 */
public class Combination
{

  private int numberDice;
  private int[] availableDice;
  private int[] completedDice;

  /**
   * Constructs a new Combination in which each die initially has 
   * the (invalid) value zero and all dice are available. In normal usage, 
   * a client would replace the available die values with randomly generated
   * numbers in an appropriate range, to simulate rolling the dice.
   * @param numDice
   *   number of dice in this group
   */
  public Combination(int numDice)
  {
    numberDice = numDice;
    availableDice = new int[numDice];
    completedDice = new int[0];

  }   
  
  /**
   * Constructs a new Combination in which each die initially has 
   * the value given by the <code>initialValues</code> array.
   * All dice are initially available. The number of dice is determined
   * by the size of the given array.
   * <p>
   * This version of the constructor is primarily intended for testing.
   * @param initialValues
   *   initial values for the dice
   */
  public Combination(int[] initialValues)
  {
    numberDice = initialValues.length;
    availableDice = initialValues;
    completedDice = new int[0];

  }  
  
  /**
   * Returns the number of dice in this group.
   * @return
   *   number of dice in this group
   */
  public int getNumDice()
  {
    return numberDice;
  }

  /**
   * Selects a die value to be moved from the available dice to the
   * completed dice. Has no effect if the given value is 
   * not among the values in the available dice. 
   * @param value
   *   die value to be moved
   */
  public void choose(int value)
  {
    ArrayList<Integer> temp = new ArrayList<>();
    for (int j = 0; j < availableDice.length; j++) {
      temp.add(availableDice[j]);
    }
    temp.remove(value);
    availableDice = new int[temp.size()];
    for(int k = 0; k < availableDice.length; k++) {
      availableDice[k] = temp.get(k);
    }

    int[] tempC = new int[completedDice.length + 1];
    for (int i = 0; i < completedDice.length; i++) {
      tempC[i] = completedDice[i];
    }
    tempC[tempC.length - 1] = value;
    completedDice = tempC;

  }

  /**
   * Causes all die values be moved from the available dice to the
   * completed dice. After this method is called, <code>getAvailable</code>
   * always returns an empty array, and <code>isComplete</code> returns true.
   */
  public void chooseAll()
  {
    ArrayList<Integer> temp = new ArrayList<>();
    for(int i = 0; i < completedDice.length; i++) {
      temp.add(completedDice[i]);
    }
    for(int j = 0; j < availableDice.length; j++) {
      temp.add(availableDice[j]);
    }
    completedDice = new int[temp.size()];
    availableDice = new int[0];
    for(int k = 0; k < completedDice.length; k++) {
      completedDice[k] = temp.get(k);
    }
  }
  
  /**
   * Determines whether there are any dice available to be 
   * rolled in this combination.
   * @return
   *   true if there are no available dice, false otherwise
   */
  public boolean isComplete()
  {
    if(availableDice.length == 0) {
      return true;
    }
    return false;
  }

  /**
   * Returns the values of the dice that are not available
   * to be re-rolled, in ascending order.
   * @return
   *   values of the dice that are not available to be re-rolled
   */
  public int[] getCompletedDice()
  {
    Arrays.sort(completedDice);
    return completedDice;
  }
  
  /**
   * Returns the values of the dice that are available to
   * be re-rolled, in ascending order.
   * @return
   *   dice that are available to be re-rolled
   */
  public int[] getAvailableDice()
  {
    Arrays.sort(availableDice);
    return availableDice;
  }
 
  /**
   * Returns all die values in this combination, in ascending order.
   * @return
   *   all die values in this group
   */
  public int[] getAll()
  {
    ArrayList<Integer> temp = new ArrayList<>();
    for(int i = 0; i < availableDice.length; i++) {
      temp.add(availableDice[i]);
    }
    for(int j = 0; j < completedDice.length; j++) {
      temp.add(completedDice[j]);
    }
    int[] allDice = new int[temp.size()];
    for(int k = 0; k < allDice.length; k++) {
      allDice[k] = temp.get(k);
    }

    Arrays.sort(allDice);
    return allDice;
  }
  
  /**
   * Replaces the available dice with the given values.
   * Throws an IllegalStateException if the length of
   * the given array does not match the number of available
   * dice in this Combination.
   * @param newValues 
   *   array of new die values for available dice
   * @throws IllegalStateException
   *   if the given array has the wrong length
   */
  public void updateAvailableDice(int[] newValues)
  {
    if(newValues.length == availableDice.length) {
      availableDice = newValues;
    }
  }
  
  /**
   * Returns a string representation of the die values in
   * this combination, in the form <em>available</em>(<em>complete</em>).
   * (For example, if there are two completed dice with values 2
   * and 4, and there are 3 available dice with values 1, 1, and 6,
   * then the method returns the string
   * <pre>
   * 1 1 6 (2 4)
   * </pre>
   * @return 
   *   string representation of the available and completed dice,
   *   with the completed values in parentheses
   */
  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    int[] avail = getAvailableDice();
    int[] completed = getCompletedDice();
    if (avail.length > 0)
    {
      for (int value : avail)
      {
        sb.append(value + " ");


      }
    }
    sb.append("(");
    if (completed.length > 0)
    {
      // use an index so we can add the first one without a leading space
      sb.append(completed[0]);
      for (int i = 1; i < completed.length; ++i)
      {
        sb.append(" " + completed[i]);
      }
    }
    sb.append(")");
    return sb.toString();
  }
  
}
