package com.valeriygulin.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    private Service service;

    @BeforeEach
    void setService() {
        this.service = new Service();
    }

    @Test
    void sum() {
        Service service = new Service();
        int sum = service.sum(10, 15);
        Assertions.assertEquals(25, sum);
    }

    @Test
    void evenOrOdd_evenNum() {
        Service service = new Service();
        boolean b = service.evenOrOdd(10);
        Assertions.assertTrue(b);
    }

    @Test
    void evenOrOdd_oddNum() {
        Service service = new Service();
        boolean b = service.evenOrOdd(11);
        Assertions.assertFalse(b);
    }

    @Test
    void divide_byZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> service.divide(10, 0));
    }
}
