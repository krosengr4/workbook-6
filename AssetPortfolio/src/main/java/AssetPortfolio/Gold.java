package AssetPortfolio;

public class Gold extends FixedAsset {

    double weight;

    public Gold(double weight, double marketValue) {
        super("gold", marketValue);
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
        return this.weight * marketValue;
    }
}
