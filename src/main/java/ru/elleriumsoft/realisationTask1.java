package ru.elleriumsoft;

import ru.elleriumsoft.Arrays.ArrayVector;
import ru.elleriumsoft.Arrays.LinkedListVector;

/**
 * Created by kokorevds on 26.01.17.
 */
public class realisationTask1
{
    public void start()
    {
        System.out.println("Задача №1");
        ArrayVector arrayVector = new ArrayVector(10);;
        arrayVector.fillArrayRandomVector(10);
        System.out.println("ArrayVector to string=" + arrayVector.toString());
        LinkedListVector linkedListVector = new LinkedListVector();
        linkedListVector.fillArrayRandomVector(10);
        System.out.println("LinkedListVector to string=" + linkedListVector.toString());
        System.out.println("");
    }


}
