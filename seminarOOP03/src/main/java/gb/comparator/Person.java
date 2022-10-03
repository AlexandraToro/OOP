package gb.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    private static int compare(Person o1, Person o2) {
        return Integer.compare(o1.height, o2.height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    // 1  version
//    @Override
//    public int compareTo(Person o) {
//        return Integer.compare(this.age,o.age);
//    }


    // 2 version
//    @Override
//    public int compareTo(Person o) {
//        if(this.name.compareTo(o.name)==0){
//            if(this.weight > o.weight){
//                return 1;}
//            else if(this.weight ==o.weight){
//                return 0;
//            }
//            else return -1;
//            }
//        return this.name.compareTo(o.name);
//    }


    //3 version
    @Override
    public int compareTo(Person o) {
        if(this.height > o.height){
            return 1;}
        else if(this.height ==o.height){
            return this.name.compareTo(o.name);
            }
        else return -1;
    }

    public static void main(String[] args) {
        ArrayList<Person> peoples= new ArrayList<>();
        peoples.add(new Person("Sasha",28,68,1));
        peoples.add(new Person("Viktor",48,85,164));
        peoples.add(new Person("Sergey",45,70,154));
        peoples.add(new Person("Sasha",18,98,188));
        peoples.add(new Person("Anna",33,70,164));
        peoples.add(new Person("James",54,60,184));
        peoples.add(new Person("Maxim",10,38,145));
        Collections.sort(peoples);
        for (Person i: peoples) {
            System.out.println(i);
        }

    }
}
