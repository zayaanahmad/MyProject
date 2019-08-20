package stepdefs;


import com.google.inject.Inject;
import connectors.BitcoinDataConnector;
import cucumber.api.java8.En;
import models.BitcoinPrice;
import utils.SharedState;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BitcoinSteps implements En {

    @Inject
    public BitcoinSteps(SharedState sharedState, BitcoinDataConnector bitcoinDataConnector) {

        Given("^I fetch bitcoin price data$", () -> {

            sharedState.setBitcoinData(bitcoinDataConnector.fetchLatestChromeDriverVersion("https://api.exmo.com"));

        });

        Then("^There are more than (\\d+) bitcoin available$", (Integer amount) -> {

            List<BitcoinPrice> sell = sharedState
                    .getBitcoinData()
                    .getBTC_USD()
                    .stream()
                    .filter(bp -> bp.getType().equals("sell"))
                    .sorted(Comparator.comparing(bp -> Double.parseDouble(bp.getPrice())))
//                    .filter(bp -> Double.parseDouble(bp.getPrice()) > )
                    .collect(Collectors.toList());
//            am.forEach(mylist.add());
            sell.forEach(System.out::println);


//            assertThat(am.isEmpty()).isFalse();


        });
        And("^The price is less than (\\d+) USD$", (Integer price) -> {

            List<BitcoinPrice> buy = sharedState
                    .getBitcoinData()
                    .getBTC_USD()
                    .stream()
                    .filter(bp -> bp.getType().equals("buy"))
                    .sorted(Comparator.comparing(bp -> Double.parseDouble(bp.getPrice())))
//                    .filter(bp -> Double.parseDouble(bp.getPrice()) > )
                    .collect(Collectors.toList());
//            am.forEach(mylist.add());
            buy.forEach(System.out::println);
        });


//        Then("^There are more than (\\d+) bitcoin available$", (Integer amount) -> {
//
//            List<BitcoinPrice> collect = sharedState
//                    .getBitcoinData()
//                    .getBTC_USD()
//                    .stream()
//                    .filter(bp -> Double.parseDouble(bp.getAmount()) > amount)
//                    .collect(Collectors.toList());
//            collect.forEach(System.out::println);
//            assertThat(collect.isEmpty()).isFalse();
//        });
//        And("^The price is less than (\\d+) USD$", (Integer price) -> {
//
//            List<BitcoinPrice> collect = sharedState
//                    .getBitcoinData()
//                    .getBTC_USD()
//                    .stream()
//                    .filter(bp -> Double.parseDouble(bp.getPrice()) < price)
//                    .collect(Collectors.toList());
//            collect.forEach(System.out::println);
//            assertThat(collect.isEmpty()).isFalse();
//        });

    }
}
