package AssetPortfolio;

public class Gold extends FixedAsset {

    double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    //region setters and getters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //endregion

    @Override
    public double getValue() {
        return 0.0;
    }
}
