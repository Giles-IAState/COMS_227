package library;

import java.util.Date;

/**
 * A ReferenceItem is a library item that cannot be checked out.
 */
public class ReferenceItem extends ItemTwo
{
    /**
     * Constructs a ReferenceItem with the given title.
     * @param givenTitle
     */
    public ReferenceItem(String givenTitle)
    {
        super(givenTitle);
    }

    @Override
    public void checkOut(Patron p, Date now)
    {
        // can't be checked out
    }

    @Override
    public void checkIn()
    {
        // can't be checked out
    }

    @Override
    public double getFine(Date now)
    {
        return 0;
    }

    @Override
    public boolean isOverdue(Date now)
    {
        return false;
    }


    @Override
    public boolean isCheckedOut()
    {
        return false;
    }

    @Override
    public Date getDueDate()
    {
        return null;
    }

    @Override
    public Patron getPatron()
    {
        return null;
    }

}