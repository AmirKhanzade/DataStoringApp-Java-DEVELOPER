public class Person {
    //TODO 1: declare instance variables
    //Add the instance variables name (a String), age (int), and weight (double).
    String name;
    int age;
    double weight;

    public Person(String name,int age,double weight) {
        //TODO 2: complete the constructor
        this.name=name;
        this.age=age;
        this.weight=weight;

    }
    public String toString() {
        //TODO 3: use the String.format() method to return string representation of the object
        return String.format("Hello , my name is %s and my age is %d","Nick",25);

    }
}
