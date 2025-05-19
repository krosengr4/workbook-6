package AssetPortfolio;

public abstract class FixedAsset implements IValuable {

    String name;
    double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public abstract double getValue();

}
