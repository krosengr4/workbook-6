package AssetPortfolio;

public class Jewelry extends FixedAsset{

    double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    //region setters and getters
    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }
    //endregion

    @Override
    public double getValue() {
        return 0.0;
    }
}
