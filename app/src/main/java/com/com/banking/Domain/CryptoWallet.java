package com.com.banking.Domain;

public class CryptoWallet {
    private String cryptoSymbol;
    private String picUrl;
    private Double changPercent;
    private Double propertyAmount;
    private Double cryptoBalance;

    public CryptoWallet(String cryptoSymbol, String picUrl, Double changPercent, Double propertyAmount, Double cryptoBalance) {
        this.cryptoSymbol = cryptoSymbol;
        this.picUrl = picUrl;
        this.changPercent = changPercent;
        this.propertyAmount = propertyAmount;
        this.cryptoBalance = cryptoBalance;
    }

    public String getCryptoSymbol() {
        return cryptoSymbol;
    }

    public void setCryptoSymbol(String cryptoSymbol) {
        this.cryptoSymbol = cryptoSymbol;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Double getChangPercent() {
        return changPercent;
    }

    public void setChangPercent(Double changPercent) {
        this.changPercent = changPercent;
    }

    public Double getPropertyAmount() {
        return propertyAmount;
    }

    public void setPropertyAmount(Double propertyAmount) {
        this.propertyAmount = propertyAmount;
    }

    public Double getCryptoBalance() {
        return cryptoBalance;
    }

    public void setCryptoBalance(Double cryptoBalance) {
        this.cryptoBalance = cryptoBalance;
    }
}
