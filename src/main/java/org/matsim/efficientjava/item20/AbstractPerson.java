package org.matsim.efficientjava.item20;

public abstract class AbstractPerson implements Person{
    int height;
    String name;


    public AbstractPerson(int height, String name){
        this.height = height;
        this.name =name;
    }

    abstract boolean isPersonHigher(int someheight);

    @Override
    public boolean isPersonSmaller(int someheight){
        return height<someheight;                       //primitive int initialised to 0
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

}
