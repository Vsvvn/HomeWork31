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
    void userCheckArgument() {
        String email = user1.getEmail();
        String login = user1.getLogin();
        assertEquals(email, user1.getEmail());
        assertEquals(login, user1.getLogin());
    }

    @Test
    void noArgumentUser() {
        assertNull(user2.getEmail(), user2.getLogin());
    }

    @Test
    void notEqualEmailAndLogin() {
        assertNotEquals(user1.getEmail(), user1.getLogin());
    }

    @Test
    @DisplayName("checking for the presence of '@' and dot characters in the email address")
    void checkEmail() {

        assertTrue(user1.getEmail().contains("@"));
        assertTrue(user1.getEmail().contains("."));
    }
}
