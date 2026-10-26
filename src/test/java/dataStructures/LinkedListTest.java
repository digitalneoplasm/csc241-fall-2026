/*
The philosophy is to test meaninful units of our program. This means writing tests
that end up using each method, case, etc.

We're concering ourselves with outward behavior.

The general structure of our tests follows the AAA acronym.
- Arrange - Get the system into a known state before you do your test.
- Act - Perform the action we are testing.
- Assert - Check to make sure the state of the system is what you expect.

The FIRST-U Rules define some properties tests should have:
- Fast - In large systems there will be thousands of tests, don't do extra stuff in your tests!
- Independent - Never write tests that rely on other tests.
- Repeatable - Tests should give the same output every time they run.
- Self-validating - There should be no human interpretation of tests.
- Timely - You should write tests around the same time you write the code.
- Understadable - Give tests good names, comment important stuff.
 */

package dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {


    @Test
    void addFirstToEmptyList() {
        // Arrange
        LinkedList<String> ll = new LinkedList<>();
        String toAdd = "rabbit";

        // Act
        ll.addFirst(toAdd);

        // Assert
        assertEquals(1, ll.size());
        assertEquals(toAdd, ll.get(0));
    }

    @Test
    void addFirstToExistingList() {
        // Arrange
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(4);
        ll.addFirst(22);

        // Act
        ll.addFirst(42);

        // Assert
        assertEquals(3, ll.size());
        assertEquals(42, ll.get(0));
        assertEquals(22, ll.get(1));
        assertEquals(4, ll.get(2));
    }

    @Test
    void getIndexOutOfBounds() {
        // Arrange
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(4);
        ll.addFirst(22);

        // Act + Assert
        assertThrowsExactly(IndexOutOfBoundsException.class, () -> ll.get(-1));
        assertThrowsExactly(IndexOutOfBoundsException.class, () -> ll.get(2));
        assertDoesNotThrow(() -> ll.get(0));
    }

}
