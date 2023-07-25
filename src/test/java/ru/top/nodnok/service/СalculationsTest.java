package ru.top.nodnok.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.top.nodnok.message.ResultDataMessage;

import static org.junit.jupiter.api.Assertions.*;

class СalculationsTest {

    public static Calculations solver;

    @BeforeAll
    public static void SetUp(){
        solver = new Calculations();
    }
    @Test
    void solve() {
        Integer a= 126;
        Integer b= 70;
        ResultDataMessage expected = new ResultDataMessage(14,630);
        ResultDataMessage actual = solver.solve(a,b);
        assertEquals(expected.getGreatestCommonDivisor(), actual.getGreatestCommonDivisor());
        assertEquals(expected.getLeastCommonMultiple(), actual.getLeastCommonMultiple());
    }
}