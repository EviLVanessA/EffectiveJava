package com.study.chapter2.demo3;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 消除过期的对象引用
 * <p>
 * 以下程序存在内存泄漏
 * 在极端的情况下，这种内存泄漏会导致磁盘交换（ Disk Paging ），甚至导
 * 致程序失败（ OutOfMemoryError 错误），但是这种失败情形相对比较少见
 * <p>
 * 无意识的对象保存
 *
 *
 * 只要类是自己管理的，就要警惕内存泄漏的问题，一旦元素被释放掉，则该元素中包含的任何对象的引用都应该被清空
 * @author jianghui
 * @date 2020-12-01 10:04
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     * 无意识的对象保存
     * 该pop方法会保留大于size的对象，存在着过期引用
     *
     * @return
     */
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        //存在着过期引用 elements[size] 为过期引用
        return elements[--size];
    }


    public Object pop2() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        //Eliminate obsolete reference 消除过时的引用
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
