package com.autobots.bank_system;

public class ExchangeRate {
        public static double convert(double amount, Currency from, Currency to) {
            double usdAmount = amount / getRate(from);
            return usdAmount * getRate(to);
        }

        private static double getRate(Currency currency) {
            switch (currency) {
                case USD: return 1.0;
                case EUR: return 1.1;
                case KGS: return 0.011;
                default: throw new IllegalArgumentException("Unknown currency");
            }
        }
}
