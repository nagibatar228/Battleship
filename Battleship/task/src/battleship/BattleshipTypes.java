package battleship;

public enum BattleshipTypes {
    AIRCRAFT_CARRIER("Aircraft Carrier", 5),
    BATTLESHIP("Battleship", 4),
    SUBMARINE("Submarine", 3),
    CRUISER("Cruiser", 3),
    DESTROYER("Destroyer", 2);

    String name;
    int length;

    BattleshipTypes(String name, int length) {
        this.name = name;
        this.length = length;
    }
}
