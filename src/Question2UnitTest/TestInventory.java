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
	private Inventory inventory;
	
	@Mock
	private Inventory spyInventory;
	
	@Mock
	private InventoryItem item;
	
	@BeforeEach
	void setUp() throws Exception {
		 
	}
	
	@AfterEach
	void tearDown() throws Exception {
		inventory = null;
		//spyInventory = null;
		item = null;
	}
	
	@Test
	void test_inventory_getCount() {
		item = new InventoryItem("Furniture", 100, "Chair", 1);
		inventory = mock(Inventory.class);
		inventory.addItemToInventory(item);
		Mockito.verify(inventory).addItemToInventory(item);
		assertEquals(0, inventory.getCount());
	}
	
	@Test
	void test_inventory_addItemToInventory() {
		Inventory spyInventory = Mockito.spy(new Inventory());
		spyInventory.addItemToInventory(item);
		Mockito.verify(spyInventory).addItemToInventory(item);
		assertEquals(1, spyInventory.getCount());
	}
}