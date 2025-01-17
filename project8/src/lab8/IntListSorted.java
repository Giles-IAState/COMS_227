package lab8;

/**
 * Subclass of IntList that guarantees that the elements are always
 * in ascending order.
 */
public class IntListSorted extends IntList
{
    /**
     * Constructs an empty list.
     */
    public IntListSorted()
    {
        super();
    }

    /**
     * Adds a new item to this list, inserting it so that
     * the list remains sorted.
     */
    @Override
    public void add(int newItem)
    {
        if (size() == 0 || get(size() - 1) <= newItem)
        {
            super.add(newItem);
        }
        else
        {
            int i = size();
            while (i > 0 && newItem < get(i - 1))
            {
                i -= 1;
            }

            // now i is 0, or newItem >= list[i - 1], so put the new
            // element at position i
            super.insert(i, newItem);
        }
    }

    /**
     * Inserts a new item in this list, inserting it so that
     * the list remains sorted.  (The given index is ignored.)
     */
    @Override
    public void insert(int index, int newItem)
    {
        this.add(newItem);
    }

    @Override
    public int getMaximum() {
        return list[size];
    }

    @Override
    public int getMinimum() {
        return list[0];
    }

    public int getMedian() {
        if(size % 2 != 0) {
            return list[size / 2];
        }
        else {
            return list[(size / 2) - 1];
        }
    }
}