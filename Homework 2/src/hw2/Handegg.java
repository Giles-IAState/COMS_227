package hw2;

/**
 * This class encapsulates the logic and state for a highly simplified
 * game of American football.
 *
 * @author Cole Giles
 */
public class Handegg {
    /**
     * Number of points awarded for a touchdown.
     */
    public static final int TOUCHDOWN_POINTS = 6;
    /**
     * Number of points awarded for a successful extra point attempt
     * after a touchdown.
     */
    public static final int EXTRA_POINTS = 1;
    /**
     * Number of points awarded for a field goal.
     */
    public static final int FIELD_GOAL_POINTS = 3;
    /**
     * Total length of the field from goal line to goal line, in yards.
     */
    public static final int FIELD_LENGTH = 100;
    /**
     * Initial position of the offensive team after a touchdown and extra point
     attempt.
     */
    public static final int STARTING_POSITION = 30;
    /**
     * Yards required to get a first down.
     */
    public static final int YARDS_FOR_FIRST_DOWN = 10;

    private int location;
    private int theOffense;
    private int down;
    private int teamZeroScore;
    private int teamOneScore;
    private int distanceToDown = 10;

    /**
     * Constructs a new game
     */
    public Handegg(){
        location = STARTING_POSITION;
        theOffense = 0;
        down = 1;
        teamZeroScore = 0;
        teamOneScore = 0;
    }

    /**
     * Records the result of an extra point attempt, adding EXTRA_POINTS if the attempt was successful.
     * @param success
     */
    public void extraPoint(boolean success){

        if (success) {
            if (theOffense == 0)
                teamZeroScore += EXTRA_POINTS;
            else
                teamOneScore += EXTRA_POINTS;
            switchTeams(true);
            down = 1;
        }
        else
            switchTeams(true);
    }

    /**
     * Records the result of a field goal attempt, adding FIELD_GOAL_POINTS if the field goal was successful.
     * @param success
     */
    public void fieldGoal(boolean success) {

        if (success) {
            if (theOffense == 0)
                teamZeroScore += FIELD_GOAL_POINTS;
            else
                teamOneScore += FIELD_GOAL_POINTS;
            switchTeams(true);
            down = 1;
        }
        else
            switchTeams(false);
    }

    /**
     * Returns the location of the ball as the number of yards, possibly resulting in a first down, a touchdown, a turnover, or an interception.
     * @return
     */
    public int getLocation(){return location;}

    /**
     * Returns the points for the indicated team.
     * @param whichTeam
     * @return
     */
    public int getScore(int whichTeam){
        if(whichTeam == 0)
            return teamZeroScore;
        else
            return teamOneScore;
    }

    /**
     * Returns the number of yards the offense must advance the ball to get a first down.
     * @return
     */
    public int getYardsToFirstDown(){return distanceToDown;}

    /**
     * Records the result of passing the ball the given number of yards, possibly resulting in a first down, a touchdown, a turnover, or an interception.
     * @param yards
     * @param intercepted
     */
    public void pass(int yards, boolean intercepted) {

        location += yards;
        down++;
        distanceToDown -= yards;

        if(down > 4){
            down = 1;
            switchTeams(false);
        }
        if(distanceToDown <= 0){
            down = 1;
            distanceToDown = 10;
        }
        if (intercepted) {
            switchTeams(false);
            down = 1;
        }

        if(location >= FIELD_LENGTH){
            if(theOffense == 0)
                teamZeroScore += TOUCHDOWN_POINTS;
            else
                teamOneScore += TOUCHDOWN_POINTS;
        }
    }


    /**
     * Records the result of a punt.
     * @param yards
     */
    public void punt(int yards){
        theOffense = 1 - theOffense;

        if(yards > location && yards <= 50)
            location = yards - location;
        else
            location = 0;
    }

    /**
     * Records the result of running the ball the given number of yards, possibly resulting in a first down, a touchdown, or a turnover.
     * @param yards
     */
    public void run(int yards){

        location += yards;
        distanceToDown -= yards;
        down++;
        if(down > 4){
            down = 1;
            distanceToDown = 10;
            switchTeams(false);
        }
        if(distanceToDown <= 0){
            down = 1;
            distanceToDown = 10;
        }
        if(distanceToDown >= 50)
            location = 0;

        if(location >= FIELD_LENGTH){
            if(theOffense == 0)
                teamZeroScore += TOUCHDOWN_POINTS;
            else
                teamOneScore += TOUCHDOWN_POINTS;
        }
    }

    /**
     * Returns the current down.
     * @return
     */
    public int whichDown(){return down;}

    /**
     * Returns the index for the team currently playing offense.
     * @return
     */
    public int whoIsOffense(){return theOffense;}

    private void switchTeams(boolean success){
        theOffense = 1 - theOffense;
        if(!success)
            location = FIELD_LENGTH - location;
        else
            location = STARTING_POSITION;
    }
}
