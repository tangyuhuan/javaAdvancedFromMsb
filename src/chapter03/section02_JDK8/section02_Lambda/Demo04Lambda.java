package chapter03.section02_JDK8.section02_Lambda;


import chapter03.section02_JDK8.section02_Lambda.domain.Person;

/**
 * 4-04-Lambda表达式Lambda的基本使用
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo04Lambda {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("周杰伦",33,175));
        list.add(new Person("刘德华",43,185));
        list.add(new Person("周星驰",38,177));
        list.add(new Person("郭富城",23,170));

/*        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println("------sort方法的第二个参数是一个Comparator接口的匿名内部类，且执行的方法有参数和返回值，那么我们可以改写为Lambda表达式-----");

        Collections.sort(list,(Person o1,Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        for (Person person : list) {
            System.out.println(person);
        }
    }


}
