import org.example.PhoneBook;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeAll
    public static void iniSut() {
        System.out.println("Running test");
    }

    @AfterAll
    public static void completeSut() {
        System.out.println("Test completed");
    }

    @BeforeEach
    public void initEachTestFourth() {

        phoneBook = new PhoneBook();
        System.out.println(PhoneBook.class + " создан");
    }

    @AfterEach
    public void afterEachTestFourth() {
        phoneBook = null;
        System.out.println(PhoneBook.class + " обнулен");
    }

    @Test
    public void addContactFirstTest() {
        String name = "Иван";
        String phoneNumber = "88889992222";

        int expected = 1;
        int result = phoneBook.add(name, phoneNumber);

        assertEquals(expected, result);
    }
    @Test
    public void addContactSecondTest() {
        phoneBook.add("Иван", "88889992222");
        phoneBook.add("Павел", "88889992233");
        phoneBook.add("Сергей", "88889992244");
        phoneBook.add("Оля", "88889992255");

        String name = "Таня";
        String phoneNumber = "88889992266";

        int expected = 6;
        int result = phoneBook.add(name, phoneNumber);

        assertEquals(expected, result);
    }

    @Test
    public void findByNumberFirstTest() {
        phoneBook.add("Иван", "88889992222");
        phoneBook.add("Павел", "88889992233");
        phoneBook.add("Сергей", "88889992244");
        phoneBook.add("Оля", "88889992255");

        String phoneNumber = "88889992255";

        String expected = "Оля";
        String result = phoneBook.findByNumber(phoneNumber);

        assertEquals(expected, result);
    }

    @Test
    public void findByNumberSecondTest() {
        phoneBook.add("Иван", "88889992222");
        phoneBook.add("Павел", "88889992233");

        String phoneNumber = "88889992222";

        String expected = "Иван";
        String result = phoneBook.findByNumber(phoneNumber);

        assertEquals(expected, result);
    }

}
