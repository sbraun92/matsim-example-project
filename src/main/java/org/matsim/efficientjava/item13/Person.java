package org.matsim.efficientjava.item13;

public class Person{
    private double weight;
    private double age;

    public double getWeight() {
        return weight;
    }

    public double getAge() {
        return age;
    }

    public Person(double weight, double age) {
        this.weight = weight;
        this.age = age;
    }

//    @Override
//    public Person clone(){ return super.clone();}

    public Person clone(){
        try{
            return (Person) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

}
