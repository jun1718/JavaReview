package com.nhnacademy.java.review.main;

public class Card {
    enum Kind {
        CLOVER, HEART, DIAMOND, SPADE
    }

    enum Value {
        TWO, THREE, FOUR
    }

    Kind kind;
    Value value;

    public static void main(String[] args) {
        Kind a = Card.Kind.CLOVER;
        Value b = Card.Value.TWO;

        if (a.equals(b)) {
            System.out.println("같다");
        }

    }

}
