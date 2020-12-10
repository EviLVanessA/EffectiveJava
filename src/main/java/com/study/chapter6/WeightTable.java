package com.study.chapter6;

/**
 * @author jianghui
 * @date 2020-12-09 09:19
 */
public class WeightTable {
    public static void main(String[] args) {
//        double earthWeight = Double.parseDouble(args[0]);
//        double mass = earthWeight / Planet.EARTH.getSurfaceGravity();
        for (Planet p : Planet.values()){
            System.out.println(p);
        }

    }
}
