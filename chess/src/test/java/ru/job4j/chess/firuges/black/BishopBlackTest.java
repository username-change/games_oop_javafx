package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void position() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertEquals(Cell.C1, bishop.position());
    }

    @Test
    void copy() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Figure copied = bishop.copy(Cell.G5);
        assertTrue(copied instanceof BishopBlack);
        assertEquals(Cell.G5, copied.position());
    }
}