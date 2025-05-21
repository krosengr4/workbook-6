package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        employeeList();
        nameList();
    }

    public static void employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mike", "Receptionist", 4000));
        employeeList.add(new Employee("Sarah", "Front Desk", 3500));
        employeeList.add(new Employee("Bill", "Manager", 6500));
        employeeList.add(new Employee("Cinnamon", "Entertainment", 2700));
        employeeList.add(new Employee("Sarah", "House Keeping", 3300));

        //Using stream, filter, and collect methods
        List<Employee> matchingEmps = employeeList.stream()
                .filter(p -> p .getName().equals(p.getName()))
                .collect(Collectors.toList());

        System.out.println("Matching: " + matchingEmps.size());
    }

    public static void nameList() {
        List<String> names = new ArrayList<>();
        names .add("Ezra");
        names .add("Ian");
        names .add("Siddalee");
        names .add("Elisha");
        names .add("Pursalane");
        names .add("Zephaniah");

        //Using lambda in the forEach method to easily loop through list and print names
        names.forEach(name -> System.out.println(name));
        //This could also be written like: "names.forEach(System.out::println);"
    }


}
