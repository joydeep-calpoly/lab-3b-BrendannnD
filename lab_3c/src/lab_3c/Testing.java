package lab_3c;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Testing {

    @Test
    public void testGetDatabaseID() {
        Database mockDatabase = Mockito.mock(Database.class);
        when(mockDatabase.getUniqueId()).thenReturn(42);
        Service service = new Service(mockDatabase);
        assertEquals(service.getDatabaseID(), "Using database with id: 42");
    }
}
