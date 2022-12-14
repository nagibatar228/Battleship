package battleship;

public class ShipPosition {
    private Point start;
    private Point end;

    public ShipPosition(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
