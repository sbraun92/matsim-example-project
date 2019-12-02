package org.matsim.efficientjava.item20;

public class Run {
    public static void main(String[] args) {
        Student a = new Student(180,"Soehnke");
        System.out.println(a.isPersonHigher(150));
        System.out.println(a.isPersonHigher(200));
    }
}
