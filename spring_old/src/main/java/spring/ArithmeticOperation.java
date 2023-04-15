package spring;

public class ArithmeticOperation {
    private MathematicalFunction mathematicalFunction;

    private Integer value1;
    private Integer value2;


//    public ArithmeticOperation(MathematicalFunction mathematicalFunction){
//        this.mathematicalFunction = mathematicalFunction;
//    }

    public ArithmeticOperation(){}

    public void setMathematicalFunction(MathematicalFunction mathematicalFunction) {
        this.mathematicalFunction = mathematicalFunction;
    }

    public void setValue11(Integer value1) {
        this.value1 = value1;
    }

    public void setValue22(Integer value2) {
        this.value2 = value2;
    }

    public Integer getValue1() {
        return value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void performOperation(){
        System.err.println("Выполняем " + mathematicalFunction.getFunction(value1, value2));
    }
}
