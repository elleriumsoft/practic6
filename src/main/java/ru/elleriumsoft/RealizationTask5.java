package ru.elleriumsoft;

import ru.elleriumsoft.Arrays.ArrayVector;
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
                System.out.println("Ошибка изменения вектора №" + i + ": " ex.getMessage());
            }
        }
        System.out.println("Измененный массив: " + arrayVector.toString());
    }
}
