package net.laggedhero.justchillinoff.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by laggedhero on 22/07/15.
 */
@RunWith(MockitoJUnitRunner.class)
public class AdderTest {

    @Test
    public void shouldAddTwoInts() {
        int expected = 3;
        assertEquals(expected, Adder.add(1, 2));
    }
}
