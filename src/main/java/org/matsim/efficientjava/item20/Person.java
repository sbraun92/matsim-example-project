package org.matsim.efficientjava.item20;

public interface Person extends Comparable{
    public int getHeight();
    public void setHeight(int someheight);
    public boolean isPersonSmaller(int someheight);
}
