package ru.netology.service;

import org.junit;
import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        service.remain(amount);
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        service.remain(amount);
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        service.remain(amount);
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain4() {
        int amount = 1100;
        int expected = 900;
        CashbackHackService service = new CashbackHackService();
        service.remain(amount);
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain5() {
        int amount = 1001;
        int expected = 999;
        CashbackHackService service = new CashbackHackService();
        service.remain(amount);
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain6() {
        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        service.remain(amount);
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}