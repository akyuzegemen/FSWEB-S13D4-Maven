package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance()
    {
        return Math.sqrt((this.getY() * this.getY()) + (this.getX() * this.getX()));
    }

    public double distance(Point p)
    {
        return Math.sqrt(((this.getY() - p.getY()) * (this.getY() - p.getY()) )+ (this.getX() - p.getX()) * (this.getX() - p.getX()));
    }

    public double distance(int x, int y)
    {
        Point p = new Point(x, y);
        return distance(p);

    }
}
