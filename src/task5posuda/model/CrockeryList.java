package task5posuda.model;

import java.util.Arrays;

public class CrockeryList {
    public static final int INITIAL_SIZE = 6;
    private Crockery[] crockeries1 = new Crockery[INITIAL_SIZE];
    private int currentIndex = 0;

    // добавление имеющегося массива
    public void addCrockeries(Crockery... outCrockery) {
        for (Crockery crockery : outCrockery) {
            add(crockery);
        }
    }

    // добавление объекта в массив
    public void add(Crockery crockery) {
        if (crockery != null) {
            if (currentIndex == crockeries1.length) {
                crockeries1 = Arrays.copyOf(crockeries1, crockeries1.length * 2);
            }
            crockeries1[currentIndex++] = crockery;
        }
        crockeries1 = Arrays.copyOf(crockeries1, currentIndex);
    }

    // Откорректировать поле article склонированных объектов.
    public void setArticle() {
        // запрос на ввод  номера для изменения
        crockeries1[6].setArticle(111);
        crockeries1[7].setArticle(333);
    }

    // Посчитать среднюю стоимость всех сковородок (Pan) в массиве и вывести на экран
    public double averageCostPans() {
        double sum = 0, avg = 0;
        int counter = 0;
        for (Crockery crockery : crockeries1) {
            if (crockery instanceof Pan) {
                sum += crockery.calculationСost();
                counter++;
            }
        }
        avg = sum / counter;
        return avg;
    }

    // Посчитать средний объём всех кастрюль (Casserole) в массиве и вывести на экран
    public double averageVolumeCasserole() {
        double sum = 0, avg = 0;
        int counter = 0;
        for (Crockery crockery : crockeries1) {
            if (crockery instanceof Casserole) {
                sum += crockery.getVolume();
                counter++;
            }
        }
        avg = sum / counter;
        return avg;
    }

    // Найти в массиве посуду примерно равную по стоимости и объёму заданной
    public void findByVolumeCost() {

    }

    //  показать объекты
    public void show() {
        System.out.println("Сrockery List");
        for (Crockery crockery : crockeries1) {
            System.out.println(crockery);
        }
    }
}
