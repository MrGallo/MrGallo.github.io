import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person("Frank", "Smith", 35);
    }

    @Test
    public void testShouldGetFullName() {
        assertEquals("Frank Smith", person.getName());
    }

    @Test
    public void testShouldGetAge() {
        assertEquals(35, person.getAge());
    }

    @Test
    public void testShouldSetName() {
        person.setName("Francesco", "Smith");
        assertEquals("Francesco Smith", person.getName());
    }

    @Test
    public void testShouldSetAge() {
        person.setAge(44);
        assertEquals(44, person.getAge());
    }
}
