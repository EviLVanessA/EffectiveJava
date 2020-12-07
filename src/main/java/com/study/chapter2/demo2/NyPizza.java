package com.study.chapter2.demo2;

import java.util.Objects;

/**
 * @author jianghui
 * @date 2020-11-30 18:01
 * 子类方法声明返回超级类中声明的返回类型的子类型，这被称作协变返回类型
 */
public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

}
