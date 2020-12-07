package com.study.chapter2.demo2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * 遇到多个构造器参数时要考虑使用构建器
 * @author jianghui
 * @date 2020-11-30 17:51
 */
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
