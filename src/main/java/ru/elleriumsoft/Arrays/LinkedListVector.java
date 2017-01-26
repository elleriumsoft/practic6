package ru.elleriumsoft.Arrays;

import java.util.*;

/**
 * Created by kokorevds on 26.01.17.
 */
public class LinkedListVector extends LinkedList<Vector>
{
    public void fillArrayRandomVector(int sizeArray)
    {
        for (int i = 0; i<sizeArray; i++)
        {
            add(i, new Vector((float)(Math.random()*100), (float)(Math.random()*100)));
        }
    }

    public void fillArrayVectorsInOrder(int sizeArray)
    {
        for (int i = 0; i<sizeArray; i++)
        {
            add(i, new Vector(i, i));
        }
    }

    @Override
    public String toString()
    {
        StringBuffer arrayToString = new StringBuffer("");
        for (int i=0; i<size(); i++)
        {
            arrayToString.append('(').append(get(i).getX()).append(',').append(get(i).getY()).append(')');
        }
        return arrayToString.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LinkedListVector))
            return false;

        ListIterator<Vector> e1 = listIterator();
        ListIterator<Vector> e2 = listIterator();
        while (e1.hasNext() && e2.hasNext())
        {
            Vector o1 = e1.next();
            Vector o2 = e2.next();
            if ((o1==null || o2==null) || !(o1.getX() == o2.getX() && o1.getY() == o2.getY()))
            {
                return false;
            }
        }
        return !(e1.hasNext() || e2.hasNext());
    }
}
