import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.Shopping;
import model.ShoppingBusinessLogic;

/**
 * Audrey N. Johnston - ajohnston10
 * CIS175
 * Jan 22, 2024
 */
public class TestListCost {
	private ArrayList<Double> listCost = new ArrayList<Double>();

	Shopping shoppingList = new Shopping(listCost);
	ShoppingBusinessLogic shoppingListLogic = new ShoppingBusinessLogic();
	
	@Before
	public void setUp() throws Exception {
	}
	

	@Test
	public void testListCost() {
		listCost.add(4.50);
		listCost.add(9.00);
		listCost.add(8.50);
		
		assertEquals(22.0, shoppingListLogic.listCost(shoppingList), 0.00);
	}

}
