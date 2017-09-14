package com.example.pc_3.studygroup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by PC-3 on 13/09/2017.
 */

public class PasswordUnitTest {
    private MainActivity act;
    private String password;

    @Before
    public void init_Activity() {
        act = new MainActivity();
        System.out.print("Testing..");
    }

    @Test
    public void password_long() throws Exception {
        password = "longPassword1*";
        System.out.println(password);
        assertTrue(act.validatePassword(password));
    }

    @Test
    public void password_short() throws Exception {
        password = "short";
        System.out.println(password);
        assertFalse(act.validatePassword(password));
    }

    @Test
    public void password_without_number() throws Exception {
        password = "shortPsw";
        System.out.println(password);
        assertFalse(act.validatePasswordWithNumber(password));
    }

    @Test
    public void password_number() throws Exception {
        password = "passWithNumer1";
        System.out.println(password);
        assertTrue(act.validatePasswordWithNumber(password));
    }

    @Test
    public void password_multiple_asserts() throws Exception {
        password = "passWzzsr1";
        System.out.println(password);
        assertTrue(act.hasNumber(password));
        assertTrue(act.isAtLeast8(password));
        assertTrue(act.hasUpperCase(password));
    }

    @After
    public void end_Activity() {
        act = null;
    }
}
