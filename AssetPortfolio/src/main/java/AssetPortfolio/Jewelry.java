package AssetPortfolio;

public class Jewelry extends FixedAsset{

    double karat;

    public Jewelry(double marketValue, double karat) {
        super("Jewelry", marketValue);
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
        return marketValue * karat;
    }
}
