package battleship;

public class Ship {
    BattleshipTypes type;
    ShipPosition begin;
    ShipPosition end;

    public Ship(BattleshipTypes type, ShipPosition begin, ShipPosition end) {
        this.type = type;
        this.begin = begin;
        this.end = end;
    }
}
