package com.rahul.converter;

import java.util.List;

public class SumOfList {
    public static int sumOflist(List<Integer> products){
        int sum = 0;
        for (int i = 0; i < products.size(); i++) {
            sum +=products.get(i);
        }
        return sum;
    }
}
