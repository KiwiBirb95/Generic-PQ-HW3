package pq;
import java.util.ArrayList;
import java.util.List;

public class PQ<E extends Comparable<? super E>>
{
    private final List<E> list;

    // Creates new empty priority queue with ArrayList
    public PQ()
    {
        list = new ArrayList<>();
    }

    // Returns reference of smallest element
    public E min()
    {
        if (list.isEmpty())
        {
            return null;
        }

        E min = list.get(0);

        for (int i = 1; i < list.size(); i++)
        {
            E current = list.get(i);

            if(current.compareTo(min) < 0)
            {
                min = current;
            }
        }
        return min;
    }

    // Inserts element into pq at the correct position using the compareTo method.
    public void insert(E element)
    {
        int i;

        for(i = 0; i < list.size(); i++)
        {
            if (element.compareTo(list.get(i)) < 0)
            {
                break;
            }
        }
        list.add(i, element);
    }

    // Removes and returns the element with the smallest value
    public E removeMin()
    {
        if (list.isEmpty())
        {
            return null;
        }

        E min = min();
        list.remove(min);
        return min;
    }

    // Returns the number of elements in priority queue
    public int size()
    {
        return list.size();
    }

    // Returns whether list is empty or not
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
}
