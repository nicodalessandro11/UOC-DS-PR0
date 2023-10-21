package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;

    @Before
    public void setUp() {
        this.pr0q = new PR0Queue();
        assertNotNull(this.pr0q.getQueue());
        pr0q.add(LocalDate.of(2023, 9, 28), 2); // initial date and offset
    }

    @After
    public void tearDown() {
        this.pr0q = null;
    }

    @Test
    public void queueTest() {
        assertEquals(this.pr0q.CAPACITY, this.pr0q.getQueue().size());
        assertEquals("09/28 09/30 10/02 10/04 10/06 10/08 10/10 10/12 10/14 10/16", this.pr0q.clearFullQueue());
        assertEquals(0, this.pr0q.getQueue().size());
    }
}
