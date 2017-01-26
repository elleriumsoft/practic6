package ru.elleriumsoft.Task1;

/**
 * Created by kokorevds on 26.01.17.
 */
public class realisationTask1
{
    public void start()
    {
        ArrayVector<Integer> arrayVector = fillArrayRandomNumbers(20);;
        System.out.println("ArrayVector to string=" + arrayVector.toString());
        LinkedListVector<Double> linkedListVector = fillLinkedListRandomNumbers(20);
        System.out.println("LinkedListVector to string=" + linkedListVector.toString());
    }

    private LinkedListVector<Double> fillLinkedListRandomNumbers(int sizeArray)
    {
        LinkedListVector<Double> arrayVector = new LinkedListVector<Double>();
        for (int i = 0; i<sizeArray; i++)
        {
            arrayVector.add(i, Math.random()*100);
        }
        return arrayVector;
    }

    private ArrayVector<Integer> fillArrayRandomNumbers(int sizeArray)
    {
        ArrayVector<Integer> arrayVector = new ArrayVector<Integer>();
        for (int i = 0; i<sizeArray; i++)
        {
            arrayVector.add(i, (int)(Math.random()*100));
        }
        return arrayVector;
    }
}
