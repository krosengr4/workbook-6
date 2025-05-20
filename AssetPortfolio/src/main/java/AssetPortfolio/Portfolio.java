package AssetPortfolio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfolio {

    String name;
    String owner;
    List<IValuable> assets = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<IValuable> getAssets() {
        return assets;
    }

    public void setAssets(List<IValuable> assets) {
        this.assets = assets;
    }
    //endregion

    public void add(IValuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double value = 0;
        for (IValuable valuable : assets) {
            value += valuable.getValue();
        }
        return value;
    }

    public IValuable getMostValuable() {
        return Collections.max(assets);
    }

    public IValuable getLeastValuable() {
        return Collections.min(assets);
    }
}
