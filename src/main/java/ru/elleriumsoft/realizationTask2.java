package ru.elleriumsoft;

import ru.elleriumsoft.Arrays.ArrayVector;
import ru.elleriumsoft.Arrays.LinkedListVector;

/**
 * Created by kokorevds on 26.01.17.
 */
public class realizationTask2
{
    public void start()
    {
        System.out.println("Задача №2");

        ArrayVector arrayVector = new ArrayVector(10);
        arrayVector.fillArrayVectorsInOrder(10);
        ArrayVector arrayVector2 = new ArrayVector(10);
        arrayVector2.fillArrayVectorsInOrder(10);
        System.out.println("Для сравнения даны 2 ArrayVector:");
        System.out.println(arrayVector.toString());
        System.out.println(arrayVector2.toString());
        System.out.println("Равенство массивов: " + String.valueOf(arrayVector.equals(arrayVector2)));

        LinkedListVector linkedListVector = new LinkedListVector();
        linkedListVector.fillArrayVectorsInOrder(20);
        LinkedListVector linkedListVector2 = new LinkedListVector();
        linkedListVector2.fillArrayVectorsInOrder(20);
        System.out.println("Для сравнения даны 2 LinkedListVector:");
        System.out.println(linkedListVector.toString());
        System.out.println(linkedListVector2.toString());
        System.out.println("Равенство массивов: " + String.valueOf(linkedListVector.equals(linkedListVector2)));
        System.out.println("");
    }
}
