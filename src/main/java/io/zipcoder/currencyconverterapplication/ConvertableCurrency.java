package io.zipcoder.currencyconverterapplication;
public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        Double a = CurrencyType.UNIVERSAL_CURRENCY.getRate() / this.getType().getRate();
        Double b = CurrencyType.UNIVERSAL_CURRENCY.getRate() / currencyType.getRate();
        return a / b;
    }
    public CurrencyType getType();
}
