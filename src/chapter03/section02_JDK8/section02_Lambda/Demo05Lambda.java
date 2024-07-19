package chapter03.section02_JDK8.section02_Lambda;

import chapter03.section02_JDK8.section02_Lambda.service.OrderService;
import chapter03.section02_JDK8.section02_Lambda.service.StudentService;

/**7-07-Lambda表达式省略写法
 * @author tyh
 * @version 1.0
 */
public class Demo05Lambda {
    public static void main(String[] args) {
        //标准写法
        goStudent((String name,Integer age)->{
            return name+age+" 6666 ...";
        });
        // 省略写法：1.小括号内的参数类型可以省略
        goStudent((name,age)->{
            return name+age+" 6666 ...";
        });
        //2.如果小括号内有且仅有一个参数，则小括号可以省略
        goOrder(name -> {
            System.out.println("--->" + name);
            return 666;
        });
        //3.如果大括号内有且仅有一个语句，可以同时省略大括号，return 关键字及语句分号。
        goOrder(name ->  666);
    }


    public static void goStudent(StudentService studentService) {
        studentService.show("张三",22);
    }
    public static void goOrder(OrderService orderService){
        orderService.show("李四");
    }
}
