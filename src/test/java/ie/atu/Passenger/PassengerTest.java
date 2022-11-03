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
        void testAge(){
            assertEquals(29, age.age(29));
        }

        @Test
        void testPhone(){
            assertEquals("0851234567", phone.phone("0851234567"));
        }
        @Test
        void testName(){
            assertEquals("0851234567", name.name("Lorcan"));
        }

        @Test
        void testId(){
            assertEquals("G0028986500", id.id("G0028986500"));
        }

        @AfterEach
        void tearDown() {
        }
    }