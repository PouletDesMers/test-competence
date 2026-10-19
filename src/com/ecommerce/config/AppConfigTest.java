package com.ecommerce.config;

public class AppConfigTest {

    public static void main(String[] args) {
        AppConfig first = AppConfig.getInstance();
        AppConfig second = AppConfig.getInstance();

        if (first != second) {
            throw new AssertionError("getInstance() doit retourner la même instance");
        }

        if (!"EUR".equals(first.getCurrency())) {
            throw new AssertionError("La devise doit être EUR");
        }

        System.out.println("Même instance : " + (first == second));
        System.out.println("Devise : " + first.getCurrency());
    }
}
