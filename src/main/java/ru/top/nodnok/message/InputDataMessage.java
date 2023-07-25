package ru.top.nodnok.message;

import io.micrometer.common.lang.NonNull;

public class InputDataMessage implements InterfaceMessage{
    private Integer a;
    private Integer b;

    public InputDataMessage() {
        a = b = 1;
    }

    public InputDataMessage(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(@NonNull Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(@NonNull Integer b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "First number a= " + a +
                ", Second number b= " + b;
    }

}
