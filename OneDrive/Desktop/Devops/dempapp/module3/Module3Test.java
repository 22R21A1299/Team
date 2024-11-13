package com.example.module3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Module3Test {
    @Test
    public void testGreet() {
        Module3 module3 = new Module3();
        assertEquals("Hello from Module 3", module3.greet());
    }
}
