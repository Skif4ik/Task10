package task5posuda;

import task5posuda.model.*;

import java.util.Scanner;

//5.1 Создать абстрактный класс Crockery с полями article, volume, material.
//5.2 Соответственно определить методы доступа и установки к полям.
//5.3 Определить метод для вычисления стоимости конкретного экземпляра посуды в
//зависимости от вида, материала и объёма.
//5.4 Создать 3 класса потомков класса Crockery: Pan, Casserole, Plate
//5.5 Переопределить методы equals() и hashCode(), toString().
//5.6 Создать массив типа Crockery
//5.7 Создать по 2 экземпляра каждого из классов и разместить их в массиве
//5.8 Используя конструктор копирования склонировать по одному из двух различных
//представителей Crockery и их также разместить в том же массиве
//5.9 Откорректировать поле article склонированных объектов.
//5.10 Посчитать среднюю стоимость всех сковородок (Pan) в массиве и вывести на экран
//5.11 Посчитать средний объём всех кастрюль (Casserole) в массиве и вывести на экран
//5.12 Найти в массиве посуду примерно равную по стоимости и объёму заданной
//(используя переопределённый метод equals() )
public class Main5 {
    public static void main(String[] args) {


        Crockery[] crockeries = {
                new Plate(129, 0.25, Material.CERAMIC),
                new Plate(133, 0.25, Material.ALUMINUM),
                new Casserole(294, 1.0, Material.CERAMIC),
                new Casserole(236, 2.0, Material.ALUMINUM),
                new Pan(344, 1.0, Material.CERAMIC),
                new Pan(326, 2.25, Material.ALUMINUM)
        };

        System.out.println("Исходный массив");
        for (Crockery crockery : crockeries) {
            System.out.println(crockery);
        }

        System.out.println("========================");
        CrockeryList crockeryList = new CrockeryList();
        crockeryList.addCrockeries(crockeries);       // добавили существующие объекты
        crockeryList.add(new Plate(crockeries[0]));  // добавление объектов через копирование
        crockeryList.add(new Pan(crockeries[4]));
        crockeryList.show();  // показали массив после добавления

        System.out.println("Массив после изменения артикула скопированных объектов");
        crockeryList.setArticle(); // изменить арт
        crockeryList.show();

        System.out.println("Cредняя стоимость всех сковородок: " + crockeryList.averageCostPans());
        System.out.println("Cредний объем всех кастрюль: " + crockeryList.averageVolumeCasserole());

        System.out.println("Введите условия отбора для поиска: объем и стоимость");
        Scanner scanner = new Scanner(System.in);
        double volume1 = scanner.nextDouble();
        double calculationСost1 = scanner.nextDouble();






 /*       for (Crockery crockery : crockeries) {
            if (crockery.equals(crockeries)) {
                System.out.println(crockery);
            }
        }

       if(crockeryRes==null){
           System.out.println("нет товара с данной ценой и стоимостью");
       }else {
           System.out.println(crockeryRes);
       }
*/
    }
}