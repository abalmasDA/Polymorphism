package ua.ithillel.javapro.task4;

import ua.ithillel.javapro.task4.Subtask1.Circle;
import ua.ithillel.javapro.task4.Subtask1.Shape;
import ua.ithillel.javapro.task4.Subtask1.Square;
import ua.ithillel.javapro.task4.Subtask1.Triangle;
import ua.ithillel.javapro.task4.Subtask2.*;

/**
 * 0. Створити базовий інтерфейс для геометричної фігури, в якому є метод, який повертає площу фігури.
 * Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат.
 * Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві
 * 1. Створіть тип даних Учасник та кілька його реалізацій: Людина, Кіт, Робот.
 * 2. Класи з п.2 повинні мати поведінку бігати і стрибати (методи просто виводять інформацію про дію в консоль).
 * 3. Створіть тип даних Перешкода та кілька її реалізацій: Бігова Доріжка та Стіна.
 * 4. Класи з п.3 повинні мати поведінку подолати перешкоду (overcome).
 * 5. Налагодити взаємодію між Учасником та Перешкодою.
 * Іншими словами, учасники під час проходження через перешкоди мають виконувати відповідні дії (бігти чи стрибати)
 * Наприклад: Людина пробігла бігову доріжку.
 * 6. Створіть два масиви: з учасниками та перешкодами.
 * 7. Кожен елемент з масиву з учасниками повинен пройти кожну перешкоду з масиву з перешкодами.
 * 8. * У перешкод є довжина (для доріжки) або висота (для стіни), а учасників обмеження на біг та стрибки.
 * Якщо учасник не зміг пройти одну з перешкод, то наступного він не приступає (цілком вибуває з участі в серії перешкод).
 * 9. * Результат виконання учасником конкретної перешкоди виводити у консоль. Наприклад: "Учасник[ІМ'Я] пройшов перешкоду[НАЗВА] на дистанції[ЗНАЧЕННЯ]"
 * "Учасник[ІМ'Я] не пройшов перешкоду[НАЗВА] на дистанції[ЗНАЧЕННЯ]. Пройдено[ЗНАЧЕНИЕ]"
 */


public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {new Square(5), new Circle(2), new Triangle(5, 5)};
        System.out.println("Total shape's area is: " + totalAreaShapes(shapes));


        Participant[] participants = {
                new Human("Dmytro", 85, 1),
                new Human("Alex", 60, 2),
                new Cat("Vasyl", 100, 1),
                new Robot("Strong", 778, 19),
        };
        Obstacle[] obstacles = {
                new RunningTrack("RunningTrack1", 50),
                new Wall("Wall1", 1),
                new RunningTrack("RunningTrack2", 100),
                new Wall("Wall2", 5),
                new RunningTrack("RunningTrack3", 250),
                new Wall("Wall3", 3),
                new Wall("Wall4", 1)
        };

        for (int i = 0; i < participants.length; i++) {
            Participant participant = participants[i];
            for (int j = 0; j < obstacles.length; j++) {
                Obstacle obstacle = obstacles[j];
                if (!obstacle.overcome(participant))
                    break;
            }
        }

    }

    static double totalAreaShapes(Shape[] shapes) {
        double totalArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].getArea();
        }
        return totalArea;
    }


}