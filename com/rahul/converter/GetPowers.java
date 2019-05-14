package com.rahul.converter;

import java.util.ArrayList;
import java.util.List;

public class GetPowers {
    public static List<Integer> getPowers(int size, int base){
        List<Integer> powers = new ArrayList<>();
        for(int i = 0;i < size; i++){
            int power =  ((int) (Math.pow(base, i)));
            powers.add(power);
        }
        return powers;
    }
}
