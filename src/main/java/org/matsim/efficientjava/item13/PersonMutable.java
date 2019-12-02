package org.matsim.efficientjava.item13;

public class PersonMutable implements Cloneable{
    public double[] attributes;     //public only for demonstration

    public double[] getAttributes(){
        return attributes;
    }

    public PersonMutable(double[] attributes){
        this.attributes = attributes;
    }

//    @Override
//    public PersonMutable clone(){
//        try{
//            return (PersonMutable) super.clone();
//        } catch (CloneNotSupportedException e){
//            throw new AssertionError();
//        }
//    }

//----------------------------------------------------------------------------------------
//    //Use clone recursively
    @Override
    protected PersonMutable clone(){
        try{
            PersonMutable myShallowCopy = (PersonMutable) super.clone();
            myShallowCopy.attributes = attributes.clone();                //Note: no cast necessary for Arrays
                                                                          //clone returns Array whose runtime and compile-time types are identical
                                                                          // BLoch writes: "In fact, arrays are the sole compelling use of the clone facility"
            return myShallowCopy;
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    //Problem: if attributes would have been final , this would not have worked
    // you might need to remove a few final modifiers

}
