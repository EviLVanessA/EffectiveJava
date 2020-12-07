package com.study.chapter3;

import java.util.Comparator;

/**
 * @author jianghui
 * @date 2020-12-01 16:27
 */
public class ComparatorDemo {
    /**
     * 这是一个错误的写法，会造成整数溢出，同时违反IEEE 754浮点算术标准，并且方法执行很慢
     */
    static Comparator<Object> hashCodeOrder = new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            return o1.hashCode() - o2.hashCode();
        }
    };

    /**
     * 使用Integer的静态方法Compare
     */
    static Comparator<Object> hashCodeOrder2 = new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            return Integer.compare(o1.hashCode(), o2.hashCode());
        }
    };
    /**
     * 使用一个比较器构造方法
     */
    static Comparator<Object> hashCodeOrder3 = Comparator.comparingInt(Object::hashCode);

}
