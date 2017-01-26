package ru.elleriumsoft;

import ru.elleriumsoft.Arrays.ArrayVector;
import ru.elleriumsoft.Arrays.LinkedListVector;
import ru.elleriumsoft.Arrays.Vector;

/**
 * Created by kokorevds on 26.01.17.
 */
public class RealizationTask5
{
    public void start()
    {
        System.out.println("Задание №5");
        ArrayVector arrayVector = new ArrayVector(10);
        arrayVector.fillArrayRandomVector(10);
        System.out.println("Исходный массив: " + arrayVector.toString());
        arrayVector.unmodifiableVector(5);
        for (int i = 0; i<arrayVector.length(); i++)
        {
            try
            {
                arrayVector.replaceVector(new Vector(10, 10), i);
            }
            catch (UnsupportedOperationException ex)
            {
                System.out.println("Ошибка изменения вектора №" + i + ": " + ex.getMessage());
            }
        }
        System.out.println("Измененный массив: " + arrayVector.toString());

        LinkedListVector linkedListVector = new LinkedListVector();
        linkedListVector.fillArrayRandomVector(10);
        System.out.println("Исходный массив: " + linkedListVector.toString());
        linkedListVector.unmodifiableVector(3);
        for (int i = 0; i<arrayVector.length(); i++)
        {
            try
            {
                linkedListVector.replaceVector(new Vector(15, 25), i);
            }
            catch (UnsupportedOperationException ex)
            {
                System.out.println("Ошибка изменения вектора №" + i + ": " + ex.getMessage());
            }
        }
        System.out.println("Измененный массив: " + linkedListVector.toString());
    }
}
