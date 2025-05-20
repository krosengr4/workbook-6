package AssetPortfolio;

public interface IValuable extends Comparable<IValuable> {

    double getValue();

    default int compareTo(IValuable o) {
        if (this.getValue() == o.getValue()) {
            return 0;
        }
        if (this.getValue() > o.getValue()) {
            return 1;
        } else {
            return -1;
        }
    }
}
