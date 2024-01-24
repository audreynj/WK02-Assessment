import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Shopping;
import model.ShoppingBusinessLogic;
/**
 * Audrey N. Johnston - ajohnston10
 * CIS175
 * Jan 22, 2024
 */
public class TestEnoughMoneyForList {
	
	Shopping shoppingList = new Shopping();
	ShoppingBusinessLogic shoppingListLogic = new ShoppingBusinessLogic();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEnoughMoneyForList() {
		shoppingList.setMoneyInWallet(100);
		shoppingList.setShoppingListCost(40);
		
		assertTrue(shoppingListLogic.enoughMoneyForList(shoppingList)); 
	}

}
