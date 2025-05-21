package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        FixedList<Integer> numbers = addIntegers();
        FixedList<LocalDate> dates = addDates();

        System.out.println("Length of numbers list: " + numbers.getItems().size());
        System.out.println("Length of dates list: " + dates.getItems().size());
    }

    public static FixedList<Integer> addIntegers() {
        FixedList<Integer> numberList = new FixedList<>(5);
        numberList.add(12);
        numberList.add(207);
        numberList.add(1900743);
        numberList.add(3);
        numberList.add(2095);
//        numberList.add(2435); //<--- adding this will get an error

        return numberList;
    }

    public static FixedList<LocalDate> addDates() {
        FixedList<LocalDate> dateList = new FixedList<>(2);
        dateList.add(LocalDate.now());
        dateList.add(LocalDate.ofYearDay(1997, 223));
//        dateList.add(LocalDate.of(2022, 2, 20)); //<--- adding this will get an error

        return dateList;
    }
}
