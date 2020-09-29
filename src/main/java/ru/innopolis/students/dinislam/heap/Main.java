package ru.innopolis.students.dinislam.heap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Переполняет heap объектами MyObject
 */
public class Main {

    /**
     * Создаем объекты и сохраняем в LinkedList.
     * Периодически зануляем объекты в List.
     *
     * @param args - входные параметры.
     */
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        scanner.next();

        final List<SuperObject> list = new LinkedList<>();
        final ThreadLocalRandom random = ThreadLocalRandom.current();

        while (true) {
            final int nextInt = random.nextInt(0, 100);
            if (list.size() > 0 && nextInt >= 51) {
                list.remove(0);
            } else {
                list.add(new SuperObject());
            }
        }
    }
}

/**
 * Тяжелый объект
 */
class SuperObject {

    int[] array = new int[1024 * 256];

}
