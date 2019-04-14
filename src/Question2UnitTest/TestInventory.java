package Question2UnitTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class TestInventory {
	
	@Mock
	private Inventory spyInventory;
	
	@Mock
	private InventoryItem item;
	private InventoryItem item2;
	
	@BeforeEach
	void setUp() throws Exception {
		spyInventory = spy(new Inventory()); //spy object
		item = mock(InventoryItem.class); //mock object
		item2= mock(InventoryItem.class); //mock object
	}
	
	@AfterEach
	void tearDown() throws Exception {
		spyInventory = null;
		item = null;
	}
	
	@Test
	void test_inventory_addItemToInventory_spy() {
		Inventory spyInventory = Mockito.spy(new Inventory());
		spyInventory.addItemToInventory(item);
		spyInventory.addItemToInventory(item2);
		Mockito.verify(spyInventory).addItemToInventory(item);
		assertEquals(2, spyInventory.getCount(), "The item count is incorrect");
	}
}