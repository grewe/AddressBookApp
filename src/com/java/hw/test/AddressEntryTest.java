package com.java.hw.test;

        import com.java.hw.addressbook.AddressEntry;

        import static org.junit.Assert.*;

public class AddressEntryTest {

    @org.junit.Test
    public void getFirstName() {
        AddressEntry instance = new AddressEntry("Dhruvin", "Patel", "2175 Aborn Rd",
                "San Jose", "CA", 95121, "408-456-9987", "dhruvinp94@gmail.com");

        String expected = "Dhruvin";
        String actual = instance.getFirstName();
        assertEquals(expected, actual);

        instance = new AddressEntry("Shivam", "Pandya", "3300 Snell Ave",
                "San Jose", "CA", 95123, "408-456-9899", "Shivam@gmail.com");

        expected = "Shivam";
        actual = instance.getFirstName();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getLastName() {
        AddressEntry instance = new AddressEntry("Dhruvin", "Patel", "2175 Aborn Rd",
                "San Jose", "CA", 95121, "408-456-9987", "dhruvinp94@gmail.com");

        String expected = "Patel";
        String actual = instance.getLastName();
        assertEquals(expected, actual);

        instance = new AddressEntry("Shivam", "Pandya", "3300 Snell Ave",
                "San Jose", "CA", 95123, "408-456-9899", "Shivam@gmail.com");

        expected = "Pandya";
        actual = instance.getLastName();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getStreet() {
        AddressEntry instance = new AddressEntry("Dhruvin", "Patel", "2175 Aborn Rd",
                "San Jose", "CA", 95121, "408-456-9987", "dhruvinp94@gmail.com");

        String expected = "2175 Aborn Rd";
        String actual = instance.getStreet();
        assertEquals(expected, actual);

        instance = new AddressEntry("Shivam", "Pandya", "3300 Snell Ave",
                "San Jose", "CA", 95123, "408-456-9899", "Shivam@gmail.com");

        expected = "3300 Snell Ave";
        actual = instance.getStreet();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getCity() {
        AddressEntry instance = new AddressEntry("Dhruvin", "Patel", "2175 Aborn Rd",
                "San Jose", "CA", 95121, "dhruvinp94@gmail.com", "408-456-9987");

        String expected = "San Jose";
        String actual = instance.getCity();
        assertEquals(expected, actual);

        instance = new AddressEntry("Shivam", "Pandya", "3300 Snell Ave",
                "San Jose", "CA", 95123, "408-456-9899", "Shivam@gmail.com");

        expected = "San Jose";
        actual = instance.getCity();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getState() {
        AddressEntry instance = new AddressEntry("Dhruvin", "Patel", "2175 Aborn Rd",
                "San Jose", "CA", 95121, "408-456-9987", "dhruvinp94@gmail.com");

        String expected = "CA";
        String actual = instance.getState();
        assertEquals(expected, actual);

        instance = new AddressEntry("Shivam", "Pandya", "3300 Snell Ave",
                "San Jose", "CA", 95123, "408-456-9899", "Shivam@gmail.com");

        expected = "CA";
        actual = instance.getState();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getZip() {
        AddressEntry instance = new AddressEntry("Dhruvin", "Patel", "2175 Aborn Rd",
                "San Jose", "CA", 95121, "408-456-9987", "dhruvinp94@gmail.com");

        int expected = 95121;
        int actual = instance.getZip();
        assertEquals(expected, actual);

        instance = new AddressEntry("Shivam", "Pandya", "3300 Snell Ave",
                "San Jose", "CA", 95123, "408-456-9899", "Shivam@gmail.com");

        expected = 95123;
        actual = instance.getZip();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getTelephone() {
        AddressEntry instance = new AddressEntry("Dhruvin", "Patel", "2175 Aborn Rd",
                "San Jose", "CA", 95121, "408-456-9987", "dhruvinp94@gmail.com");

        String expected = "408-456-9987";
        String actual = instance.getTelephone();
        assertEquals(expected, actual);

        instance = new AddressEntry("Shivam", "Pandya", "3300 Snell Ave",
                "San Jose", "CA", 95123, "408-456-9899", "Shivam@gmail.com");

        expected = "408-456-9899";
        actual = instance.getTelephone();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getEmail() {
        AddressEntry instance = new AddressEntry("Dhruvin", "Patel", "2175 Aborn Rd",
                "San Jose", "CA", 95121, "408-456-9987", "dhruvinp94@gmail.com");

        String expected = "dhruvinp94@gmail.com";
        String actual = instance.getEmail();
        assertEquals(expected, actual);

        instance = new AddressEntry("Shivam", "Pandya", "3300 Snell Ave",
                "San Jose", "CA", 95123, "408-456-9899", "Shivam@gmail.com");

        expected = "Shivam@gmail.com";
        actual = instance.getEmail();
        assertEquals(expected, actual);
    }
}