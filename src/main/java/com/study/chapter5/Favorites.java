package com.study.chapter5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 类型安全的异构容器
 * @author jianghui
 * @date 2020-12-08 15:22
 */

public class Favorites {
    private final Map<Class<?>,Object> favorites = new HashMap<>();

    public <T> void putFavourite(Class<T> type,T instance){
        favorites.put(Objects.requireNonNull(type),instance);
    }
    public <T> T getFavourite(Class<T> type){
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        Favorites favorites = new Favorites();
        favorites.putFavourite(String.class,"Java");
        favorites.putFavourite(Integer.class,0xccee);
        favorites.putFavourite(Class.class,Favorites.class);
        System.out.printf("%s %x %s%n",favorites.getFavourite(String.class)
                ,favorites.getFavourite(Integer.class),favorites.getFavourite(Class.class).getName());

    }
}
