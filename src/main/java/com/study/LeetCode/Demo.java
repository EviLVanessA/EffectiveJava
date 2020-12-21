package com.study.LeetCode;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author jianghui
 * @date 2020-12-15 10:40
 */
public class Demo {
    public static void main(String[] args) {
        String str = ".*\\〔([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})\\〕.*号$";
        System.out.println("河北〔0202〕123号".matches(str));
    }
}
