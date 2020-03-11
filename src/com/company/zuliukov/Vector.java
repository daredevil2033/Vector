package com.company.zuliukov;

import static java.lang.Math.*;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double length(){
        return (float) sqrt(pow(this.x,2)+ pow(this.y,2)+ pow(this.z,2));
    }
    public static double scalar(Vector a, Vector b){
        return a.x*b.x+a.y*b.y+a.z*b.z;
    }
    public static Vector vector(Vector a, Vector b){
        return new Vector(a.y*b.z-a.z*b.y,a.z*b.x-a.x*b.z,a.x*b.y-a.y*b.x);
    }
    public static double cos(Vector a, Vector b){
        return scalar(a,b)/(a.length()*b.length());
    }
    public static Vector sum(Vector a, Vector b){
        return new Vector(a.x+b.x,a.y+b.y,a.z+b.z);
    }
    public static Vector subtract(Vector a, Vector b){
        return new Vector(a.x-b.x,a.y-b.y,a.z-b.z);
    }
    public static Vector[] spawn(int N){
        Vector[] vectors = new Vector[N];
        for (int i = 0; i < N; i++) {
            vectors[i] = new Vector( (random() * (200 + 1)) - 100, (random() * (200 + 1)) - 100, (random() * (200 + 1)) - 100);
        }
        return vectors;
    }
}