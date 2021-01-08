package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

        @Test
        public void someTest() {
                WeightedUnionFind uf = new WeightedUnionFind(6);
                int[] ufcheck = {-1, -1, -1, -1, -1, -1};
                assertArrayEquals(ufcheck, uf.arraySet);
                uf.union(1, 5);
                uf.union(1, 2);
                uf.union(2, 0);
                uf.union(1, 3);
                uf.union(3, 4);
                assertEquals(-6, uf.parent(5));
                assertEquals(5, uf.parent(1));
                assertEquals(5, uf.parent(4));
                assertTrue(uf.connected(1,2));
                assertEquals(6, uf.sizeOf(0));
        }
}