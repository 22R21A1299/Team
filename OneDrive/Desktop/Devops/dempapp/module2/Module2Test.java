package com.example.module2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Module2Test {
    @Test
    public void testGreet() {
        Module2 module2 = new Module2();
        assertEquals("Hello from Module 2", module2.greet());
    }
}
