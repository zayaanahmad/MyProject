package models;

import connectors.BitcoinDataConnector;
import gherkin.deps.com.google.gson.Gson;

import java.util.concurrent.ExecutionException;

class Scratch {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(
                new Gson().fromJson(
                        new BitcoinDataConnector().fetchLatestChromeDriverVersion("https://api.exmo.com"),
                        BitcoinData.class
                )
        );
    }
}