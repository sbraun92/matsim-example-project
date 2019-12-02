package org.matsim.efficientjava.item13;

import org.apache.log4j.Logger;

public class RunItem13 {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(RunItem13.class);
//
        Person person1 = new Person(80.,35.);
        Person person2 = person1.clone();

        log.info(person1.getAge()+" , "+person2.getAge());
        log.info(person1.getWeight()+" , "+person2.getWeight());

        //--------------------------------------------------------

//        double[] myAttributes = {80.,35.};
//
//        PersonMutable person3 = new PersonMutable(myAttributes);
//        PersonMutable person4 = person3.clone();
//
//        log.info(person3.attributes[0] +" , "+person4.attributes[0]);
//
//        person3.attributes[0] = 70;
//
//        log.info(person3.attributes[0] +" , "+person4.attributes[0]);
//
//        //clone() made a shallow copy, thus the reference was copied and both objects pointing on the same array
//        //Show new clone method...













//        //------------------------Break some stuff
//
//        InheritedClass person5 = new InheritedClass(myAttributes);
//        InheritedClass person6 = person5.clone();

    }
}
