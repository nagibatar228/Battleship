package battleship;

import java.util.ArrayList;

import static battleship.Util.*;

public class Battlefield {
    char[][] field;
    ArrayList<Ship> ships;


    public Battlefield() {
        this.field = new char[BATTLEFIELD_SIZE][BATTLEFIELD_SIZE];
        ships = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < BATTLEFIELD_SIZE; i++) {
            for (int j = 0; j < BATTLEFIELD_SIZE; j++) {
                field[i][j] = SEA_WAVE_SYMBOL;
            }
        }
    }

    public void print() {
        StringBuilder output = new StringBuilder();
        output.append("  ");
        for (int i = 1; i <= BATTLEFIELD_SIZE; i++) {
            output.append(i).append(" ");
        }
        output.append("\n");
        for (int i = 0; i < BATTLEFIELD_SIZE; i++) {
            output.append(ROWS.charAt(i)).append(" ");
            for (int j = 0; j < BATTLEFIELD_SIZE; j++) {
                output.append(SEA_WAVE_SYMBOL).append(" ");
            }
            output.append("\n");
        }
        System.out.println(output);
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }


}
