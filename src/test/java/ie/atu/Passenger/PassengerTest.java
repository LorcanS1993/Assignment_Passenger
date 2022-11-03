package ie.atu.Passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class PassengerTest {
        Passenger title;
        Passenger age;
        Passenger phone;
        Passenger name;
        Passenger id;

        @BeforeEach
        void setUp() {
            title = new Passenger();
            age = new Passenger();
            phone = new Passenger();
            name = new Passenger();
            id = new Passenger();
        }

        @Test
        void testTitle(){
            assertEquals("Mr", title.title("Mr"));
        }

        @Test
        void testTitleFail(){
            Exception TitleMessage = assertThrows(IllegalArgumentException.class, () -> {title.title("yes");});
            assertEquals("Must be addressed by a title", TitleMessage.getMessage());
        }

        @Test
        void testAge(){
            assertEquals(29, age.age(29));
        }

        @Test
        void testAgeFail(){
            Exception UserMessage = assertThrows(IllegalArgumentException.class, () -> {age.age(12);});
            assertEquals("Must be over 16", UserMessage.getMessage());
        }

        @Test
        void testPhone(){
            assertEquals("0851234567", phone.phone("0851234567"));
        }

        @Test
        void testPhoneFail(){
            Exception PhoneMessage = assertThrows(IllegalArgumentException.class, () -> {phone.phone("y");});
            assertEquals("Phone Number must be a minimum of seven", PhoneMessage.getMessage());
        }

        @Test
        void testName(){
            assertEquals("Lorcan", name.name("Lorcan"));
        }

        @Test
        void testNameFail(){
            Exception MessageName = assertThrows(IllegalArgumentException.class, () -> {name.name("Tom");});
            assertEquals("Name must be a minimum 3 characters", MessageName.getMessage());
        }

        @Test
        void testId(){
            assertEquals("G0028986500", id.id("G0028986500"));
        }

        @Test
        void testIDFail(){
            Exception ID_Mes = assertThrows(IllegalArgumentException.class, () -> {id.id("123456789");});
            assertEquals("ID must be 10 characters", ID_Mes.getMessage());
        }

        @AfterEach
        void tearDown() {
        }
    }