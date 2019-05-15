package com.rahul.converter;

public class ParseResult {
    public int fromBase,toBase;
    public String number;

    public ParseResult(String[] args) {
        this.fromBase = Integer.parseInt(args[1]);
        this.number = args[2];
//        this.toBase = Integer.parseInt(args[3]);
    }
}

