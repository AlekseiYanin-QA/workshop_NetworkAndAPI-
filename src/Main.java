package src;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        NetUtils netUtils = new NetUtils();

        List<Stock> stocks = netUtils.getStocks();

        stocks.sort(new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                return Float.compare(o1.getValue(), o2.getValue());
            }
        });
        System.out.println("The cheapest one was: " +
                stocks.get(0).getDate() + " with value " +
                stocks.get(0).getValue());

        System.out.println("The most expensive one was on: " +
                stocks.get(stocks.size() - 1).getDate() + " with value " +
                stocks.get(stocks.size() - 1).getValue());

    }
}
