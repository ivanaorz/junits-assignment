import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DataStoreTest {
    @Test
    public void testStoreAndRetrieve() {
        // Store values and retrieve them
        DataStore.store("Hello");
        assertEquals("Hello", DataStore.retrieve());

        DataStore.store(42);
        assertEquals(42, DataStore.retrieve());

        DataStore.store(true);
        assertEquals(true, DataStore.retrieve());
    }

    @Test
    public void testRetrieveWithoutStoring() {
        // Test retrieving without storing
        assertNull(DataStore.retrieve());
    }
    @Test
    public void testOverwriteStoredValue() {
        // Store and overwrite values
        DataStore.store("OriginalValue");
        assertEquals("OriginalValue", DataStore.retrieve());

        DataStore.store("NewValue");
        assertEquals("NewValue", DataStore.retrieve());
    }

}