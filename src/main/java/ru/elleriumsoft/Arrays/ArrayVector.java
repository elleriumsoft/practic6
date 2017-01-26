package ru.elleriumsoft.Arrays;

/**
 * Created by kokorevds on 26.01.17.
 */
public class ArrayVector
{
    private Vector[] array;

    public ArrayVector(int sizeArray)
    {
        array = new Vector[sizeArray];
    }

    public void fillArrayRandomVector(int sizeFillVector)
    {
        if (sizeFillVector > array.length) {return;}

        for (int i = 0; i<sizeFillVector; i++)
        {
            array[i] = new Vector((float)(Math.random()*100), (float)(Math.random()*100));
        }
    }

    public void fillArrayVectorsInOrder(int sizeFillVector)
    {
        if (sizeFillVector > array.length) {return;}

        for (int i = 0; i<sizeFillVector; i++)
        {
            array[i] = new Vector(i, i);
        }
    }

    @Override
    public String toString()
    {
        StringBuffer arrayToString = new StringBuffer("");
        for (int i=0; i<array.length; i++)
        {
            arrayToString.append('(').append(array[i].getX()).append(',').append(array[i].getY()).append(')');
        }
        return arrayToString.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == this)
            return true;
        if (!(o instanceof ArrayVector))
            return false;

        if (length() != ((ArrayVector) o).length())
            return false;

        for (int i = 0; i<length(); i++)
        {
            if (array[i] == null || ((ArrayVector) o).getArray()[i] == null)
            {
                return false;
            }
            if (array[i].getX() != (((ArrayVector) o).getArray()[i].getX())
                    || array[i].getY() != (((ArrayVector) o).getArray()[i].getY()))
            {
                return false;
            }
        }
        return true;
    }

    public Vector[] getArray()
    {
        return array;
    }

    public void setArray(Vector[] array)
    {
        this.array = array;
    }

    public int length()
    {
        return array.length;
    }
}
