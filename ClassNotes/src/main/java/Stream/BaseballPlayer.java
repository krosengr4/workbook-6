package Stream;

public class BaseballPlayer implements Comparable<BaseballPlayer>{

    String name;
    int jerseyNumber;
    int homeRuns;

    public BaseballPlayer (String name, int jerseyNumber, int homeRuns) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.homeRuns = homeRuns;
    }

    //region getters
    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public int getHomeRuns() {
        return homeRuns;
    }
    //endregion

    public int compareTo(BaseballPlayer o) {
        if (this.homeRuns > o.homeRuns) {
            return 1;
        } else if (this.homeRuns < o.homeRuns) {
            return -1;
        } else {
            return 0;
        }
    }
}
