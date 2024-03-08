package yang.Dome20240308.dome3;

import java.sql.SQLOutput;

/**
 * @author Zhong.Yl
 * 2024/3/8 14:31
 * JavaSE_Test
 */
public class ObjectClass {
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = obj;
        System.out.println(obj2.equals(obj));
        Object str1 = new  String("123");
        Object str2 = new String("123");
        System.out.println(str1.equals(str2));
        Person p1 = new Person("yang",11);
        Person p2 = new Person("yang",11);
        System.out.println(p1.equals(p2));
    }
}
class Person{
    private String name;
    private int age;
    public Person(){

    };
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
