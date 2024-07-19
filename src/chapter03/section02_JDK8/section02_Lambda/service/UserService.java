package chapter03.section02_JDK8.section02_Lambda.service;

/**
 * @author tyh
 * @version 1.0
 *  * @FunctionalInterface
 *  *    这是一个标志注解，被该注解修饰的接口只能声明一个抽象方法
 */
@FunctionalInterface
public interface UserService {
    void show();
//    Lambda表达式的使用前提：接口中有且仅有一个抽象方法(@FunctionalInterface)！！
    /*void show2();*/
}
