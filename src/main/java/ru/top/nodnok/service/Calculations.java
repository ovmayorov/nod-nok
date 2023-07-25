package ru.top.nodnok.service;

import org.springframework.stereotype.Service;
import ru.top.nodnok.message.ResultDataMessage;

//класс для вычисления НОД и НОК
//на выходе : решение упакованное в ResultData
@Service
public class Calculations {

    public ResultDataMessage solve(Integer a, Integer b){

        int x1 = a;
        int x2 = b;
        if(a < 0){
            a = a * -1;
        }
        if(b < 0){
            b = b * -1;
        }
        if(a == 0 || b == 0){
            throw new ArithmeticException("Number should not be 0 ");
        }
        Integer greatestCommonDivisor;
        Integer leastCommonMultiple;

        // 1. greatestCommonDivisor

        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            greatestCommonDivisor = a % b;
            a = b;
            b = greatestCommonDivisor;
        }
        greatestCommonDivisor = a;

        // 2. leastCommonMultiple

        leastCommonMultiple = x1 * x2 / greatestCommonDivisor;




        return new ResultDataMessage(greatestCommonDivisor, leastCommonMultiple);
    }
}
