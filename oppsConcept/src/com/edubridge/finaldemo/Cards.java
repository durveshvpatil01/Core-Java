package com.edubridge.finaldemo;
//parent
public class Cards {
private String cardName;
private final String issuer="americal express";
public String getCardName() {
	return cardName;
}
public void setCardName(String cardName) {
	this.cardName = cardName;
}
public String getIssuer() {
	return issuer;
}
@Override
public String toString() {
	return "Cards [cardName=" + cardName + ", issuer=" + issuer + "]";
}


}
