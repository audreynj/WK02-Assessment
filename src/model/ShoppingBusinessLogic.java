package model;

import java.util.ArrayList;

/**
 * Audrey N. Johnston - ajohnston10
 * CIS175
 * Jan 22, 2024
 */
public class ShoppingBusinessLogic {

	
	
	public boolean enoughMoneyForList(Shopping shoppingList) {
		if(shoppingList.getMoneyInWallet() - shoppingList.getShoppingListCost() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double listCost(Shopping shoppingList) {
		double shoppingListCost = 0;
		for(int i=0; i<shoppingList.getItemCosts().size(); i++) {
			shoppingListCost = shoppingListCost + shoppingList.getItemCosts().get(i);
		}
		return shoppingListCost;
	}
}
