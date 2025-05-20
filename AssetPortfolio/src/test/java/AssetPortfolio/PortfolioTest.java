package AssetPortfolio;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PortfolioTest {
    Gold gold = new Gold(10, 1000);
    House house = new House(22000, 2000, 600, 4);

    @Test
    void getMostValuable() {

        Portfolio portfolio = new Portfolio("Financial Portfolio", "KEvin");
        portfolio.add(house);
        portfolio.add(gold);

        IValuable actual = portfolio.getMostValuable();

        assertEquals(house, actual);
    }

    @Test
    void getValue() {

        Portfolio portfolio = new Portfolio("Financial Portfolio", "KEvin");


    }

    @Test
    void getLeastValuable() {
    }
}