package pl.smarthouse.sharedobjects.dto.lightsmqtt;

public enum Mode {
  AUTO,
  TRIGGER,
  OFF,
  ON;

  public static Mode getNext(Mode current) {
    int nextOrdinal = (current.ordinal() + 1) % Mode.values().length;
    return Mode.values()[nextOrdinal];
  }
}
