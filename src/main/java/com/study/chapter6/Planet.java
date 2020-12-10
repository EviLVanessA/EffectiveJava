package com.study.chapter6;

/**
 * @author jianghui
 * @date 2020-12-09 09:14
 */
public enum Planet {
    MERCURY(3.302E+23,2.439E6),
    VENUS(4.869e+24,6.052E6),
    EARTH(5.975E+24,6.378E6),
    MARS(6.419E+23,3.393E6);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;
    private static final double G = 6.67300E-11;
    Planet(double mass,double radius){
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }
    public double mass(){
        return mass;
    }
    public double radius(){
        return radius;
    }
    public double getSurfaceGravity(){
        return surfaceGravity;
    }
    public double getSurfaceWeight(double mass){
        return  mass * surfaceGravity;
    }
}
