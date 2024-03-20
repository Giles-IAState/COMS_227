package library;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class ItemTwo {

    /**
     * Title of this item.
     */
    private String title;

    /**
     * Due date for this item.  This value is null when not checked out.
     */
    private Date dueDate;

    /**
     * Patron to whom this item is checked out.  This value is null when not checked out.
     */
    private Patron checkedOutTo;

    /**
     * Number of times the item has been renewed for the current patron.
     */
    private int renewalCount;

    public ItemTwo(String givenTitle) {
        title = givenTitle;
        dueDate = null;
        checkedOutTo = null;
    }

    abstract void checkOut(Patron p, Date now);

    public void checkIn()
    {
        if (isCheckedOut())
        {
            checkedOutTo = null;
            dueDate = null;
        }
    }

    public void renew(Date now)
    {
        // cannot be renewed
    }

    abstract double getFine(Date now);

    public boolean isOverdue(Date now)
    {
        if (!isCheckedOut())
        {
            return false;
        }
        return now.after(dueDate);
    }

    public int compareTo(Item other)
    {
        return title.compareTo(other.getTitle());
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isCheckedOut()
    {
        return dueDate != null;
    }

    public Date getDueDate()
    {
        return dueDate;
    }


    public Patron getPatron()
    {
        return checkedOutTo;
    }


}
