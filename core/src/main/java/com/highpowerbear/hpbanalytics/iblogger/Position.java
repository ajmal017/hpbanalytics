package com.highpowerbear.hpbanalytics.iblogger;

import com.highpowerbear.hpbanalytics.enums.Currency;
import com.highpowerbear.hpbanalytics.enums.SecType;
import com.ib.client.Contract;

/**
 * Created by robertk on 12/28/2017.
 */
public class Position {

    private String accountId;

    private String symbol;
    private String underlying;
    private Currency currency;
    private String exchange;
    private SecType secType;

    private double position;
    private double avgCost;
    private Double lastPrice;
    private Double underlyingPrice;

    public Position(String accountId, Contract contract, double position, double avgCost) {
        this.accountId = accountId;

        symbol = contract.localSymbol();
        underlying = contract.symbol();
        currency = Currency.valueOf(contract.currency());
        exchange = contract.exchange();
        secType = SecType.valueOf(contract.getSecType());

        if (exchange == null) {
            exchange = secType.getDefaultExchange();
        }

        this.position = position;
        this.avgCost = avgCost;
    }

    public boolean isShort() {
        return position < 0d;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getUnderlying() {
        return underlying;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getExchange() {
        return exchange;
    }

    public SecType getSecType() {
        return secType;
    }

    public double getPosition() {
        return position;
    }

    public double getAvgCost() {
        return avgCost;
    }

    public Double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Double getUnderlyingPrice() {
        return underlyingPrice;
    }

    public void setUnderlyingPrice(double underlyingPrice) {
        this.underlyingPrice = underlyingPrice;
    }

    @Override
    public String toString() {
        return "Position{" +
                "accountId='" + accountId + '\'' +
                ", symbol='" + symbol + '\'' +
                ", underlying='" + underlying + '\'' +
                ", currency=" + currency +
                ", exchange='" + exchange + '\'' +
                ", secType=" + secType +
                ", position=" + position +
                ", avgCost=" + avgCost +
                ", lastPrice=" + lastPrice +
                ", underlyingPrice=" + underlyingPrice +
                '}';
    }
}