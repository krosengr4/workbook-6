package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //calling methods
        collectionStateList();
        countNumberOfOdds();
        forEachNameList();
        sortPlayersByHomeRuns();
        mapIntegers();
        reduceAllNumbersToSum();
    }

    public static void collectionStateList() {

        List<String> states = Arrays.asList("California", "Texas", "New York", "Oregon", "Pennsylvania", "Tennessee");

        //!stream() method provides a pipeline where you can process on the elements in the stream
        List<String> matchingStates = states.stream()

                //! filter() method reduces the stream to only the elements that match a condition
                .filter(state -> state.startsWith("T"))

                //!Collectors combine the result of processing on the elements of stream()
                .collect(Collectors.toList()); //<--- Returns a list<T> where T is the type of data collected

        //To collect the data to an ArrayList ---> .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(matchingStates + "\n");
    }

    public static void countNumberOfOdds() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //! count() method returns a count of the number of items in the stream
        long numberOfOdds = numbers.stream()
                .filter(number -> number % 2 != 0)
                .count();

        System.out.println("There are " + numberOfOdds + " odd numbers.\n");
    }

    public static void forEachNameList() {
        List<String> names = new ArrayList<>();
        names .add("Ezra");
        names .add("Ian");
        names .add("Siddalee");
        names .add("Elisha");
        names .add("Pursalane");
        names .add("Zephaniah");


        //! The forEach() lambda expression is executed for each element in the collection
        names.forEach(name -> System.out.println(name)); //<--- *for each* name in list, print the name
        //This could also be written like: "names.forEach(System.out::println);"

        System.out.println();
    }

    public static void sortPlayersByHomeRuns() {
        ArrayList<BaseballPlayer> baseballPlayers = new ArrayList<>();
        baseballPlayers.add(new BaseballPlayer("Aaron Judge", 99, 62));
        baseballPlayers.add(new BaseballPlayer("Sammy Sosa", 21, 66));
        baseballPlayers.add(new BaseballPlayer("Barry Bonds", 25, 73));
        baseballPlayers.add(new BaseballPlayer("Mark McGwire", 25, 70));

        //!The sorted() method will sort the stream
        ArrayList<BaseballPlayer> playersByHomeruns = baseballPlayers.stream()
                .filter(player -> player.getJerseyNumber() == player.getJerseyNumber())
                //! sorted() method only works with Types that implement Comparable interface
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        playersByHomeruns.forEach(player -> System.out.println(player.name + " has " + player.homeRuns + " home runs."));
        System.out.println();
    }

    public static void mapIntegers() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 4, 3);

        //!The map() method maps each element in the stream to a new result
        List<Integer> numbersDoubled = numbers.stream()
                .map(number -> number * 2) //<--- takes lambda expression of how to get the new result
                .distinct() //<--- distinct method removes an element that repeats
                .collect(Collectors.toList());

        System.out.println(numbersDoubled);
    }

    public static void reduceAllNumbersToSum() {
        List<Integer> numbers = Arrays.asList(4, 10, 7);

        //!The reduce() method aggregates(combines) all elements into a single value of the same type
        //reduce() also acts as the collector
        int sum = numbers.stream()
                //reduce() takes initial value of aggregate(temp) and lambda of how to aggregate
                .reduce(0, (temp, num) -> temp += num);

        System.out.println("Sum = " + sum);
    }
}
