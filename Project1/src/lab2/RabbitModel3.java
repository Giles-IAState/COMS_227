package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits.
 */
public class RabbitModel3
{
    private int population;
    private int year;

    /**
     * Constructs a new RabbitModel.
     */
    public RabbitModel3()
    {
        year = 0;
        population = 500;

    }

    /**
     * Returns the current number of rabbits.
     * @return
     *   current rabbit population
     */
    public int getPopulation()
    {
        return population;
    }

    /**
     * Updates the population to simulate the
     * passing of one year.
     */
    public void simulateYear()
    {
        population /= 2;

        year++;
    }

    /**
     * Sets or resets the state of the model to the
     * initial conditions.
     */
    public void reset()
    {
        population = 500;
        year = 0;
    }
}