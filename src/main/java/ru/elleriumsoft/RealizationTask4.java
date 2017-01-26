package ru.elleriumsoft;

import ru.elleriumsoft.Arrays.ArrayVector;
import ru.elleriumsoft.Arrays.LinkedListVector;

/**
 * Created by kokorevds on 26.01.17.
 */
public class RealizationTask4
{
    public void start()
    {
        System.out.println("Задание №4");
        ArrayVector arrayVector = new ArrayVector(5);
        arrayVector.fillArrayRandomVector(5);
        System.out.println("Исходный массив: " + arrayVector.toString());
        try
        {
            ArrayVector arrayVector2 = (ArrayVector)arrayVector.clone();
            System.out.println("Клон массива: " + arrayVector2.toString());
        } catch (CloneNotSupportedException e)
        {
            System.out.println("Не удалось клонировать");
        }

        LinkedListVector linkedListVector = new LinkedListVector();
        linkedListVector.fillArrayRandomVector(5);
        System.out.println("Исходный LinkedList: " + linkedListVector.toString());
        LinkedListVector linkedListVector2 = new LinkedListVector();
        linkedListVector2 = (LinkedListVector)linkedListVector.clone();
        System.out.println("Клон LinkedList = " + linkedListVector2.toString());
        System.out.println("");
    }
}
