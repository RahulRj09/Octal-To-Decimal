package com.rahul.converter;

import java.util.ArrayList;
import java.util.List;

public class DotProductCalculator {
    public static int getDotProduct(List<Integer> x, List<Integer> y){
        List<Integer> products = new ArrayList<>();
        int product = 0;
        for (int i = 0; i < x.size() ; i++) {
            product = x.get(i)*y.get(i);
            products.add(product);
        }
        return SumOfList.sumOflist(products);
    }
}
