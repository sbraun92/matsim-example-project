package org.matsim.efficientjava.item20;

public class IntegerMapEntry<Integer> extends AbstractMapEntry<Integer,Integer>{
    Integer value;
    Integer key;



    public Integer setValue(Integer value){
        this.value = value;
        return value;
    }

    public void setKey(Integer value){
        this.key = key;
    }

    @Override
    public Integer getKey() {
        return key;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
