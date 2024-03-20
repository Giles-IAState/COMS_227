package lab3;

public class Basketball
{
    private double diameter;
    private boolean dribbleable = false;
    private double circumference;

    public Basketball(double givenDiameter)
    {
        diameter = givenDiameter;
        circumference = Math.PI * diameter;
    }

    public boolean isDribbleable()
    {
        return dribbleable;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public double getCircumference()
    {
        return circumference;
    }

    public void inflate()
    {
        dribbleable = true;
    }
}