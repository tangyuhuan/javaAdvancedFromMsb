package chapter03.section02_JDK8.section02_Lambda;

/**1.需求分析:创建一个新的线程，指定线程要执行的任务,Runnable 匿名内部类的传统写法
 * 2.Lambda表达式初体验
 * @author tyh
 * @version 1.0
 *
 */
public class Demo01Lambda {

    public static void main(String[] args) {
        // 开启一个新的线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程中执行的代码 : "+Thread.currentThread().getName());
            }
        }).start();
        System.out.println("主线程中的代码：" + Thread.currentThread().getName());
        System.out.println("---------------");
//      Runnable 匿名内部类的传统写法用Lambda表达式改写
        new Thread(()->{
            System.out.println("新线程中执行的代码-lambda : "+Thread.currentThread().getName());
        }).start();
    }
}
