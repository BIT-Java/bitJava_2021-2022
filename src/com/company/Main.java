package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Computer{
    public void compute(Pair<String, Integer> pair){
        String key = pair.getKey();
        int value = pair.getValue();
        System.out.println("computing " + key + " " + value);
    }
}

class Box<T>{
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}


public class Main {

    private static <T> List<T> toList(T[] array){
        List<T> result = new LinkedList<>();
        for (T t : array) {
            result.add(t);
        }
        return result;
    }

    private static void invokeMethod(String methodName, Object object) throws InvocationTargetException, IllegalAccessException {
        Class<?> objectClass = object.getClass();
        for (Method m : objectClass.getDeclaredMethods()) {
            if(m.getName().equals(methodName)){
                m.setAccessible(true);
                m.invoke(object);
            }
        }
    }

    private static void showDataUsingReflection(Object person){
        Class<?> personClass = person.getClass();
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
            System.out.println(declaredMethod.getReturnType());
            for(Annotation declaredAnnotation : declaredMethod.getDeclaredAnnotations()){
                System.out.println(declaredAnnotation);
            }
        }
    }

    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException {
        Person person = new Person("Ben", 30);
//        showDataUsingReflection(person);
        invokeMethod("speak", person);
//        simulateMonsters();

    }

    private static void simulateMonsters() {
        List<Monster> monsters = Arrays.asList(new Wolf(40, 3), new Ork(100, 5), new Monster(10, 1));
        Spawner monsterSpawner = new Spawner(monsters);
        monsterSpawner.spawn();
        System.out.println(monsterSpawner.spawn());
        System.out.println(monsterSpawner.spawn());
        System.out.println(monsterSpawner.spawn());
        Spawner wolfSpawner = new Spawner(Arrays.asList(new Wolf(40, 3), new Wolf(100, 5), new Ork(30, 3)));
        System.out.println(wolfSpawner.spawn());
        System.out.println(wolfSpawner.spawn());
    }

}
