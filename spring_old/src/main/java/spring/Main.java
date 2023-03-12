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
        ArithmeticOperation arithmeticOperation = context.getBean("AO", ArithmeticOperation.class);
        arithmeticOperation.performOperation();
        System.out.println(arithmeticOperation.getValue1());
        System.out.println(arithmeticOperation.getValue2());
        context.close();
    }
}
