package test.user;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {


    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    public void setUp() {

        user1 = new User("login", "test@ya.ru");
        user2 = new User();
        user3 = new User("login", "login");
    }

    @Test
    @DisplayName("When an object is created by passing parameters, then the test is correct.")
    void userCheckArgument() {
        String email = "test@ya.ru";
        String login = "login";
        assertEquals(email, user1.getEmail());
        assertEquals(login, user1.getLogin());
    }

    @Test
    @DisplayName("When an object is created without passing parameters to it, then the test is correct.")
    void noArgumentUser() {
        assertNull(user2.getEmail());
        assertNull(user2.getLogin());
    }

    @Test
    @DisplayName("When login and email do not match, then they are correct.")
    void notEqualEmailAndLogin() {
        assertNotEquals(user1.getEmail(), user1.getLogin());
    }

    @Test
    @DisplayName("When the email address contains the characters '@' and '.', then the test is correct.")
    void checkEmail() {

        assertTrue(user1.getEmail().contains("@"));
        assertTrue(user1.getEmail().contains("."));
    }
}
