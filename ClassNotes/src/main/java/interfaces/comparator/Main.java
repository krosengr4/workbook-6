package interfaces.comparator;

public class Main {


    public static void main(String[] args) {

        int teamVSTeam = comparingTeams();
        System.out.println(teamVSTeam);

        comparingNames();
    }

    public static int comparingTeams() {
        Team team1 = new Team("Chupacabras", 19, 4);
        Team team2 = new Team("Rancheros", 2345, 34);

        return team1.compareTo(team2);
    }

    public static void comparingNames() {
        Person me = new Person("UncMelchi");
        Person you = new Person("Kev");
        int result = me.compareTo(you);
        System.out.println(result);
    }


}
