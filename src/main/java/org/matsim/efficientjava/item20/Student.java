package org.matsim.efficientjava.item20;

public class Student extends AbstractPerson {

    public Student(int height, String name) {
        super(height, name);
    }

    @Override
    boolean isPersonHigher(int someheight) {
        return false;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}








/*
    public Student(int height, String name) {
        super(height,name);
    }

    @Override
    boolean isPersonHigher(int someheight) {
        return super.height>someheight;
    }

    @Override
    public int getHeight() {
        return super.height;
    }

    @Override
    public void setHeight(int a) {
        super.height = a;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }*/