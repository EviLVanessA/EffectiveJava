package com.study.chapter7;

import java.util.*;

/**
 * @author jianghui
 * @date 2020-12-09 16:15
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abcdee");
        list.add("cddeeee");
        list.add("ab");
        list.add("derceeeeee");

        list.sort(Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(list.toArray()));
    }
}
