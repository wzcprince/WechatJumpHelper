package com.tencent.wechatjump.helper.bean;


public class Tuple2<A, B> {

    public final A first;

    public final B second;

    public Tuple2(A a, B b){
        first = a;
        second = b;
    }

    public String toString(){
        return "(" + first + ", " + second + ")";
    }

}

/*
public class Tuple3<A, B, C> extends Tuple2<A, B>{

    public final C third;

    public Tuple3(A a, B b, C c) {
        super(a, b);
        third = c;
    }

    public String toString(){
        return "(" + first + "," + second + "," + third + ")";
    }

}

*/

