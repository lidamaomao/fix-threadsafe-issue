package com.github.hcsp.multithread;

public class Counter {
    private int value = 0;

    //创建不可变类当作锁对象
    private static final Object obj = new Object();

    public int getValue() {
        return value;
    }

    // 加上一个整数i，并返回加之后的结果
    public int addAndGet(int i) {
        synchronized (obj) {
            value += i;
        }
        return value;
    }

    // 减去一个整数i，并返回减之后的结果
    public int minusAndGet(int i) {
        synchronized (obj) {
            value -= i;
        }

        return value;
    }
}
