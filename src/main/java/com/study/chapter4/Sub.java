package com.study.chapter4;

import java.time.Instant;

/**
 * @author jianghui
 * @date 2020-12-03 15:29
 */
public class Sub extends Super{
    private final Instant instant;
    Sub(){
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
