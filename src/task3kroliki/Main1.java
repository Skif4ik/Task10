package task3kroliki;

import task3kroliki.model.EyeColor;
import task3kroliki.model.Rabbit;
import task3kroliki.model.WoolColor;

//3.
//3.1 Создать класс Rabbit c полями name, weight, eyeColor, woolColor.
//3.2 Соответственно определить методы доступа и установки к полям.
//3.3 Переопределить методы equals и hashCode, toString.
//3.4 Создать объект класса Rabbit.
//3.5 Создать копию этого объекта с помощью конструктора.
//3.6 Вывести их.
//3.7 Изменить у клонированного объекта значение weight.
//3.8 Вывести начальный объект и клонированный.
//3.9 Создать в классе Rabbit статический метод для подсчета среднего
//веса двух кроликов.
public class Main1 {
    public static void main(String[] args) {

        Rabbit rabbit1 = new Rabbit("Nic", 2.5, EyeColor.BLUE, WoolColor.GREY);
        Rabbit rabbitCopy = new Rabbit(rabbit1);

        System.out.println(rabbit1);
        System.out.println(rabbitCopy);

        rabbitCopy.setWeight(3.5);
        System.out.println("Первоначальный кролик: " + rabbit1);
        System.out.println("Клонированный кролик с измененным весом: " + rabbitCopy);

        System.out.println("Средний вес кроликов: " + Rabbit.getAvgWeight(rabbit1, rabbitCopy));


    }
}
