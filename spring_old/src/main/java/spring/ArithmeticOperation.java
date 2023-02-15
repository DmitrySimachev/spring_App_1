package spring;

public class ArithmeticOperation {
    private MathematicalFunction mathematicalFunction;

    public ArithmeticOperation(MathematicalFunction mathematicalFunction){
        this.mathematicalFunction = mathematicalFunction;
    }

    public void performOperation(){
        System.err.println("Выполняем " + mathematicalFunction.getFunction());
    }
}
