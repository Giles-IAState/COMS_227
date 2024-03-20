package hw1;

/**
 * A class defining a van driving for an airport.
 * @author Cole Giles
 * @version 1.0
 */
public class AirportVan {
    /**
     * miles driven
     */
    private int miles;
    /**
     * minutes driven
     */
    private int minutes;
    /**
     * riders on the van
     */
    private int passengers;
    /**
     * tips given per delivery
     */
    private double tips;
    /**
     * points rewarded for driving.
     */
    private int points;

    private double hourlyRate;
    private int mileageBonus;
    private int timeBonus;
    private int maxRiders;

    /**
     * Constructs an Airport Van with given variables.
     * @param givenHourlyRate
     *  the hourly rate for the van
     * @param givenMileageBonus
     *  the bonus for mileage for the van
     * @param givenTimeBonus
     *  the bonus for time driven for the van
     * @param givenMaxRiders
     *  the max riders available in the van
     */
    public AirportVan(double givenHourlyRate, int givenMileageBonus, int givenTimeBonus, int givenMaxRiders){

        hourlyRate = givenHourlyRate;
        mileageBonus = givenMileageBonus;
        timeBonus = givenTimeBonus;
        maxRiders = givenMaxRiders;
    }

    /**
     * Increase the miles and minutes driven, and add points to the points variable
     * @param miles
     *  the amount of miles driven
     * @param minutes
     *  the amount of minutes driven
     */
    public void drive(int miles, int minutes) {

        this.miles += miles;
        this.minutes += minutes;
        points += (minutes * timeBonus * Math.min(passengers, 1) );
        points += (miles * mileageBonus * Math.max(passengers, 1));


    }

    /**
     *Increment the # of passengers on the van by 1, unless maxRiders has been reached.
     */
    public void pickUp() {

        passengers = Math.min(passengers + 1, maxRiders);
    }

    /**
     * Drops the # of passengers by 1, unless # passengers is zero. Adds tip to the 'tips' variable
     * @param tip
     *  the tip paid by the rider
     */
    public void dropOff(double tip) {
        tips += tip * Math.min(1, passengers);
        passengers = Math.max(passengers - 1, 0);
    }

    /**
     * Returns the average hourly pay of the van
     * @param dollarsPerPoint
     *  the given dollar value per point given.
     * @return
     * the average hourly pay of the van
     */
    public double getAverageHourlyPay(double dollarsPerPoint) {
        return ((points * dollarsPerPoint) + (hourlyRate * (minutes / 60.0)) + tips) / (minutes / 60.0);
    }

    /**
     * Returns the count of riders on the van.
     * @return
     * the current number of riders on the van.
     */
    public int getRiderCount() {

        return passengers;
    }

    /**
     * Returns the total miles driven.
     * @return
     * the total miles driven
     */
    public int getTotalMiles() {
        return miles;
    }

    /**
     * Returns the total pay for the van, using the dollarsPerPoint to calculate pay from points.
     * @param dollarsPerPoint
     * the given dollar value per point
     * @return
     * the total pay for the van
     */
    public double getTotalPay(double dollarsPerPoint) {
        return (points * dollarsPerPoint) + (hourlyRate * (minutes / 60.0)) + tips;
    }

    /**
     * Returns the total points earned for the van.
     * @return
     * the total points earned for the van.
     */
    public int getTotalPoints(){

        return points;
    }

    /**
     * Returns the total time driven.
     * @return
     * the total time driven for the van
     */
    public int getTotalTime() {
        return minutes;
    }

    /**
     * Returns the total tips earned.
     * @return
     * the total tips earned for the van
     */
    public double getTotalTips() {
        return tips;
    }

    /**
     * Adds to the minutes variable, and adds points accordingly.
     * @param minutes
     * the given amount of points earned.
     */
    public void waitAround(int minutes) {

        this.minutes += minutes;
        points += (minutes * timeBonus * Math.min(passengers, 1) );
    }
}