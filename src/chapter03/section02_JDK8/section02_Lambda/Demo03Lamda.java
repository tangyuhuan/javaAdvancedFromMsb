package chapter03.section02_JDK8.section02_Lambda;

import chapter03.section02_JDK8.section02_Lambda.service.UserService;

/**3. Lambda的语法规则
 * 3.1 Lambda练习1
 * 练习无参无返回值的Lambda
 * @author tyh
 * @version 1.0
 */
public class Demo03Lamda {
    public static void main(String[] args) {
        goShow(new UserService(){
            @Override
            public void show() {
                System.out.println("show");
            }
        });
        System.out.println("----------无参无返回值的Lambda--------");
        goShow(()->{
            System.out.println("Lambda show 方法执行了...");
        });
    }
    public static void goShow(UserService userService){
        userService.show();
    }
}
