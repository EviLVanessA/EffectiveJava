package com.study.chapter2.demo2;

import static com.study.chapter2.demo2.NyPizza.Size.SMALL;
import static com.study.chapter2.demo2.Pizza.Topping.*;

/**
 * @author jianghui
 * @date 2020-11-30 18:15
 */
public class Test {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = (Calzone) new Calzone.Builder().addTopping(HAM).sauceInside().build();
    }
}
