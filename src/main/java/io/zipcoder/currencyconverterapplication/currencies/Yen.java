package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    public CurrencyType getType() {
        return type;
    }

    public CurrencyType type = CurrencyType.YEN;
}
