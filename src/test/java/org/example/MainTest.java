package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
@Test
void checkThatCastThrowsException() {
    assertThrows(ClassCastException.class, this::functionThatTriggersException);
}

private void functionThatTriggersException() {
    GT_HashSet<Child> set = new GT_HashSet<>();

    for (Child child : set) {
        int i = 0;
    }
}
}