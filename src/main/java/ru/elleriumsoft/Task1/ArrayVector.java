package ru.elleriumsoft.Task1;

import java.util.ArrayList;

/**
 * Created by kokorevds on 26.01.17.
 */
public class ArrayVector<E> extends ArrayList<E>
{
    @Override
    public String toString()
    {
        StringBuffer arrayToString = new StringBuffer("");
        for (int i=0; i<size(); i++)
        {
            arrayToString.append(get(i)).append(',');
        }
        return arrayToString.toString();
    }
}
