package singletons;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException, IOException, ClassNotFoundException,
            CloneNotSupportedException {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println("Hashcode of singleton1 = "+singleton1.hashCode());
        System.out.println("Hashcode of singleton2 = "+singleton2.hashCode());

        //Breaking singleton with reflection api
//        singleton1 = Singleton.getInstance();
//        singleton2 = null;
//        Constructor constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        singleton2 = (Singleton) constructor.newInstance();
//        System.out.println("Hashcode of singleton1 = " + singleton1.hashCode());
//        System.out.println("Hashcode of singleton2 = " + singleton2.hashCode());


        //Breaking singleton with serialization

//        singleton1 = Singleton.getInstance();
//        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("resources/file.txt"));
//        out.writeObject(singleton1);
//        out.close();
//
//        ObjectInput in = new ObjectInputStream(new FileInputStream("resources/file.txt"));
//        singleton2 = (Singleton) in.readObject();
//        in.close();
//        System.out.println("Hash of singleton 1 = " + singleton1.hashCode());
//        System.out.println("Hash of singleton 2 = " + singleton2.hashCode());

        //Breaking singleton with Cloning
//        Singleton singleton=Singleton.getInstance();
//        System.out.println("Singleton hashcode = "+singleton.hashCode());
//        System.out.println("Singleton copy hashcode = "+((Singleton)singleton.clone()).hashCode());


    }


}
