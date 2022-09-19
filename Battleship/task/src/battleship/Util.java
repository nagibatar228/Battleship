package battleship;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Util {
    static final InputStreamReader inputStream = new InputStreamReader(System.in);
    static final char SEA_WAVE_SYMBOL = '~';
    static final char INTACT_SHIP_SYMBOL = 'O';
    static final char DAMAGED_SHIP_SYMBOL = 'X';
    static final int BATTLEFIELD_SIZE = 10;
    static final String ROWS = "ABCDEFGHIJ";

    static final String ENTER_COORDINATES_MSG = "Enter the coordinates of the %s (%d cells):\n";
}
