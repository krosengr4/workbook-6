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
        return team2.compareTo(team1);
    }

    public static void comparingNames() {
        Person me = new Person("Kevin");
        Person you = new Person("Gio");
        int result = me.compareTo(you);
        System.out.println(result);
    }


}
