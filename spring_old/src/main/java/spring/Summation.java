package spring;

public class Summation implements MathematicalFunction {

    @Override
    public String getFunction(int value1, int value2) {
        return "сложение: " + (value1 + value2);
    }
}
