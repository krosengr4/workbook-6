package interfaces.comparator;

//!We implement the Comparable interface
//The Comparable interface uses <T> as a placeholder object so we can place in whatever object we want to compare
//In this case we use Team as the object
public class Team implements Comparable<Team>{

    //define team attributes
    String name;
    int wins;
    int losses;

    //constructor
    public Team (String name, int wins, int losses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
    //endregion

    //Calculate win percent to compare
    public double calculateWinPercent() {
        int totalGames = this.getWins() + this.getLosses();
        return (double) this.wins / totalGames;
    }

    //We override the compareTo method from Comparator interface
    //The compareTo method uses o as a placeholder "other" object. The o goes inside the parens when you call .compareTo() method.
    //Ex: myValue.compareTo(otherValue)
    // returns a 1 if mine is bigger, a -1 if other is bigger, and 0 if the values are the same
    public int compareTo(Team o) {
        if (this.wins == o.wins) {
            return 0;
        } if (this.wins > o.wins) {
            return 1;
        } else {
            return -1;
        }
    }
}
