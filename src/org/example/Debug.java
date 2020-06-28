package org.example;

import java.util.ArrayList;
import java.util.List;

public class Debug {

//            Быстрый хинт по настройке панели Project:
//            - быстрый доступ из кода, быстрый доступ к коду
//            - плоские пакеты
//            - настройки идеи
//            - настройки проекта
//
//            Добавляем интеграцию гита в идею к существующему проекту через основное меню идеи
//            - устанавливаем плагин gitignore
//            - устанавливаем плагин KeyPromoter
//
//            Коротко об интерфейсе идеи: где что касательно гита::
//            - вызов панели гита, скрытие всех панелей
//            - кнопки пуша и пула

    // добавляем к проекту поддержку VCS

    // создаём .gitignore

//        Создаём проект на гитхабе
//        - добавляем в проект ремоут
//        - пушим изменения
//        - несколько слов о нескольких ремоутах


    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.err.println("Error");
        List<Integer> persons = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            persons.add(getRandom());
        }
        int billionare = 0;
        int defaults = 0;
        int regular = 0;
        for (Integer person : persons) {
            person += getRandom();
            if (person > 1_000_000_000 || person < 0) {
                billionare++;
            } else if (person > 0)
                regular++;
            else defaults++;
        }

        System.err.println("defaults = " + defaults);
        System.err.println("regular = " + regular);
        System.err.println("billionare = " + billionare);
        System.err.println("regular + billionare+defaults = " + (regular + billionare + defaults));
        System.out.println("Program successfully ended");
    }

    private static int getRandom() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }


//        - добавляем ветку в репозиторий с новой фичей с несколькими коммитами
//        - мёржим её в основную ветку, убеждаемся что проблем не возникло
//        - пушим в репозиторий, убеждаемся, что в репозитории новой ветки нет
//        - переключаемся на новую ветку, пушим. убеждаемся, что ветка появилась.
//        - делаем изменения в основной ветке.
//        - примерно в тех же местах делаем изменения в новой ветке.
//            - сливаем. решаем конфликты при слиянии.
//            - различные виды просмотра различий в идее
//        - разрешаем конфликты, мёржим.
//            - новая ветка с добавлением фичи
//        - делаем слияние ребейзом
//        - пушим всё на ремоут.
//
//            - убеждаемся, что можем откатываться в истории:
//            - софт ресеты
//        - хардесеты (только в ветках с ремоутом)
//
//        - черипик
//
//        Просмотр истории:
//            - посмотреть кто совершил коммит на полях
//        - посмотреть в каком коммите
//        - сравнить с удалённой веткой при наличии закоммиченных, но не запушенных изменениях
//
//        Возможности идеи в плане истории.

}
