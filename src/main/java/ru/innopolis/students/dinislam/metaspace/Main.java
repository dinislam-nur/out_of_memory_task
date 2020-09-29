package ru.innopolis.students.dinislam.metaspace;

import javassist.ClassPool;


/**
 * Переполнение Metaspace загрузкой классов в рантайме
 * Максимальный размер Metaspace ограничен 32мб.
 */
public class Main {

    public static void main(String args[]) throws Exception{

        ClassPool classPool = ClassPool.getDefault();
        int i = 0;
        while (true) {
            Class c = classPool.makeClass("MyObject" + i).toClass();
            i++;
        }
    }
}
