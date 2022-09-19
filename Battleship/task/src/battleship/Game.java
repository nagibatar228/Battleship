package battleship;

import java.io.BufferedReader;
import java.io.IOException;

import static battleship.Util.inputStream;

public class Game {
    private Battlefield battlefield;

    public Game() {
        battlefield = new Battlefield();
    }

    private ShipPosition askCoordinates() {
        String[] coordinates;
            try {
                coordinates = new BufferedReader(inputStream).readLine().split("\\s+");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
    public void start() {
        battlefield.print();
        askCoordinates();
    }




}
