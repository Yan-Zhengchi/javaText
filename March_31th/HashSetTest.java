package March_31th;

import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {
    //在HashSet集合中添加三个Person对象，把姓名相同的人当做同一个人，禁止重复添加
    public static void main(String[] args) {
        Person person1 = new Person("张三");
        Person person2 = new Person("张三");
        Person person3 = new Person("李四");
        HashSet<Person> people = new HashSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        for (Person person : people) {
            System.out.println(person.name);
        }

    }
}
class Person{
    String name ;
    Person(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
