package entity;

public class Position {
    public int positionId;
    public PositionName positionName;
    public enum PositionName {
        DEV, TEST, SCRUM_MASTER, PM
    }
    public Account[] accounts;

    public Position() {
    }

    public Position(int positionId, PositionName positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }
}
