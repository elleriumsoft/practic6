package ru.elleriumsoft.Arrays;

/**
 * Created by kokorevds on 26.01.17.
 */
public class Vector
{
    private float x;
    private float y;
    private boolean unmodifiable = false;

    public Vector(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float getX()
    {
        return x;
    }

    public void setX(float x) throws UnsupportedOperationException
    {
        if (isUnmodifiable())
        {
            throw new UnsupportedOperationException("Вектор запрещено менять");
        }
        this.x = x;
    }

    public float getY()
    {
        return y;
    }

    public void setY(float y) throws UnsupportedOperationException
    {
        if (isUnmodifiable())
        {
            throw new UnsupportedOperationException("Вектор запрещено менять");
        }
        this.y = y;
    }

    public boolean isUnmodifiable()
    {
        return unmodifiable;
    }

    public void setUnmodifiable(boolean unmodifiable)
    {
        this.unmodifiable = unmodifiable;
    }
}
