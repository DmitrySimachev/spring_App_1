package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        SpringApplication testBean = context.getBean("testBean", SpringApplication.class);
//        System.out.println(testBean.getName());

        /**
         * Проблема сложной зависимости
         * */
//        MathematicalFunction mathematicalFunction = context.getBean("MF", MathematicalFunction.class);
//        ArithmeticOperation arithmeticOperation = new ArithmeticOperation(mathematicalFunction);
//        arithmeticOperation.performOperation();
//        context.close();

        /**
         * Проблема объекты создаются в ручную
         * */
        ArithmeticOperation arithmeticOperation1 = context.getBean("AO", ArithmeticOperation.class);
        ArithmeticOperation arithmeticOperation2 = context.getBean("AO", ArithmeticOperation.class);

        boolean bool = arithmeticOperation1 == arithmeticOperation2;

        arithmeticOperation1.setValue11(10);
        arithmeticOperation2.setValue11(20);

        System.out.println(bool);
        System.out.println(arithmeticOperation1.getValue1());
        System.out.println(arithmeticOperation2.getValue1());

//        arithmeticOperation.performOperation();
//        System.out.println(arithmeticOperation.getValue1());
//        System.out.println(arithmeticOperation.getValue2());
        context.close();
    }
}
