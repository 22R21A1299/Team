package com.example.module1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class module1test {
    @Test
    public void testGreet() {
        Module1 module1 = new Module1();
        assertEquals("Hello from Module 1", module1.greet());
    }
}
