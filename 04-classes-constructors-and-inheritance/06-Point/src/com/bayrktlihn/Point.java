package com.bayrktlihn;

public class Point {
    private int x;
    private int y;

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

    public double distance(){
        return distance(0,0);
    }

    public double distance(int x , int y){
        double result = Math.pow(this.x - x, 2) + Math.pow(this.y -y , 2);
        return Math.sqrt(result);
    }

    public double distance(Point point){
        return distance(point.x, point.y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(){
        
    }
    
    public static void main(String[] args) {
		Point first = new Point(6, 5);
		Point second = new Point(3,1);
		
		System.out.println("distance(0,0)= "+first.distance());
		System.out.println("distance(second)= "+first.distance(second));
		System.out.println("distance(2,2)= "+first.distance(2,2));
		
		Point point = new Point();
		System.out.println("distance()= "+point.distance());
	}
}
