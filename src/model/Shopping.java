package model;

import java.util.ArrayList;

/**
 * Audrey N. Johnston - ajohnston10
 * CIS175
 * Jan 22, 2024
 */
public class Shopping {


	//Declaring variables
	private ArrayList<Double> itemCosts = new ArrayList<Double>();
	private double shoppingListCost;
	private double moneyInWallet;

	//Getter and setter methods
	public ArrayList<Double> getItemCosts() {
		return itemCosts;
	}
	public void setItemCosts(ArrayList<Double> itemCosts) {
		this.itemCosts = itemCosts;
	}

	public double getShoppingListCost() {
		return shoppingListCost;
	}
	public void setShoppingListCost(double shoppingListCost) {
		this.shoppingListCost = shoppingListCost;
	}

	public double getMoneyInWallet() {
		return moneyInWallet;
	}
	public void setMoneyInWallet(double moneyInWallet) {
		this.moneyInWallet = moneyInWallet;
	}

	//Constructors
	
	public Shopping(double shoppingListCost, double moneyInWallet) {
		this.shoppingListCost = shoppingListCost;
		this.moneyInWallet = moneyInWallet;
	}
	
	public Shopping(ArrayList<Double> itemCosts) {
		this.itemCosts = itemCosts;
	}
	
	public Shopping() {
	}
	
	
	
	
	
	
}
