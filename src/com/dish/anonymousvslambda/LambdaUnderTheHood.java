package com.dish.anonymousvslambda;

import com.dish.anonymous.quote.StockQuote;

public class LambdaUnderTheHood {

    public static void main(String[] args) {

        new StockQuote(){

            @Override public Double getQuote(String ticker) {
                return null;
            }
        };

        new StockQuote(){

            @Override public Double getQuote(String ticker) {
                return null;
            }
        };

        new StockQuote(){

            @Override public Double getQuote(String ticker) {
                return null;
            }
        };

        new StockQuote(){

            @Override public Double getQuote(String ticker) {
                return null;
            }
        };

//        StockQuote stockQuote = (ticker) -> 210.0;
//        stockQuote = (ticker) -> 310.0;
//        stockQuote = (ticker) -> 410.0;
//        stockQuote = (ticker) -> 510.0;
//        stockQuote = (ticker) -> 610.0;
//        stockQuote = (ticker) -> 710.0;
//        stockQuote = (ticker) -> 810.0;

    }


}
