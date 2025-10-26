import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest {
    @Test
    void testGetDisplayName() {
        Person person = new Person("Josh", "Hayden", LocalDate.parse("2013-01-12"));
        String displayName = person.getDisplayName();
        assertEquals("Hayden, Josh", displayName);
    }

    @Test
    void testGetAge() {
        Person person = new Person("Joey", "Doe", LocalDate.parse("2013-01-12"));
        long age = person.getAge();
        assertEquals(4, age);
    }
}