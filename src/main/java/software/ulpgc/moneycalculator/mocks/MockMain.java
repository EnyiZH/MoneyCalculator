package software.ulpgc.moneycalculator.mocks;

import software.ulpgc.moneycalculator.*;
import software.ulpgc.moneycalculator.fixerws.FixerCurrencyLoader;

import java.io.IOException;
import java.util.List;

public class MockMain {
    public static void main(String[] args) throws IOException {
        CurrencyLoader currencyLoader = new FixerCurrencyLoader();
        List<Currency> currencies1 =currencyLoader.load();
        for(Currency currency : currencies1){
            System.out.println(currency);
        }
    }
}
