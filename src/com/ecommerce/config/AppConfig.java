package com.ecommerce.config;

public final class AppConfig {

    private final String currency;

    private AppConfig() {
        this.currency = "EUR";
    }

    private static final class Holder {
        private static final AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance() {
        return Holder.INSTANCE;
    }

    public String getCurrency() {
        return currency;
    }
}
