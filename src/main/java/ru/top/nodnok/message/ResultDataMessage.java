package ru.top.nodnok.message;

//класс для храниния ответа
//the Greatest Common Divisor and the Least Common Multiple
public class ResultDataMessage implements InterfaceMessage{
    private final Integer greatestCommonDivisor; //Наибольший общий делитель
    private final  Integer leastCommonMultiple; //Наименьшее общее кратное

    public ResultDataMessage(Integer greatestCommonDivisor, Integer leastCommonMultiple) {
        this.greatestCommonDivisor = greatestCommonDivisor;
        this.leastCommonMultiple = leastCommonMultiple;
    }

    public Integer getGreatestCommonDivisor() {
        return greatestCommonDivisor;
    }

    public Integer getLeastCommonMultiple() {
        return leastCommonMultiple;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "the Greatest Common Divisor= " + greatestCommonDivisor +
                ", the Least Common Multiple= " + leastCommonMultiple +
                '}';
    }
}
