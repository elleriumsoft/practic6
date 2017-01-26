package ru.elleriumsoft;

import ru.elleriumsoft.Arrays.ArrayVector;
import ru.elleriumsoft.Arrays.LinkedListVector;

/**
 * Created by kokorevds on 26.01.17.
 */
public class realizationTask3
{
    public void start()
    {
        System.out.println("Задача №3");
        ArrayVector arrayVector = new ArrayVector(10);
        arrayVector.fillArrayRandomVector(10);
        System.out.println("Массив: " + arrayVector.toString());
        System.out.println("Его hash = " + arrayVector.hashCode());

        ArrayVector arrayVector2 = new ArrayVector(15);
        arrayVector2.fillArrayRandomVector(10);
        System.out.println("Массив: " + arrayVector2.toString());
        System.out.println("Его hash = " + arrayVector2.hashCode());

        LinkedListVector linkedListVector = new LinkedListVector();
        linkedListVector.fillArrayRandomVector(20);
        System.out.println("LinkedList: " + linkedListVector.toString());
        System.out.printf("Его hash = " + linkedListVector.hashCode());
    }
}
