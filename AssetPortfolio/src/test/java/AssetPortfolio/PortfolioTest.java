package AssetPortfolio;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PortfolioTest {
    Gold gold = new Gold(10, 1000);
    House house = new House(2000, 2000, 200, 4);

    @Test
    void getMostValuable() {
        Portfolio portfolio = new Portfolio("Financial Portfolio", "Kevin");
        portfolio.add(house);
        portfolio.add(gold);

        IValuable actual = portfolio.getMostValuable();

        assertEquals(house, actual);
    }

    @Test
    void getValue() {
        Portfolio portfolio = new Portfolio("Financial Portfolio", "Kevin");
        portfolio.add(house);
        portfolio.add(gold);

        double actual = portfolio.getValue();

        assertEquals(410000, actual);
    }

    @Test
    void getLeastValuable() {
        Portfolio portfolio = new Portfolio("Financial Portfolio", "Kevin");
        portfolio.add(house);
        portfolio.add(gold);

        IValuable actual = portfolio.getLeastValuable();

        assertEquals(gold, actual);
    }
}