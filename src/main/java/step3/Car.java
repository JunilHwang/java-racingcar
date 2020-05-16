package step3;

public class Car {
  private int position;

  private Car (int position) {
    validatePosition(position);
    this.position = position;
  }

  public void going (int n) {
    this.position += n;
  }

  public String toString () {
    String str = "";
    for (int i = 0; i < this.position; i++) str += "-";
    return str;
  }

  public static Car of (int position) {
    return new Car(position);
  }

  public static void validatePosition (int position) {
    if (position < 0) throw new IllegalArgumentException("자동차의 위치는 0 이상만 가능합니다.");
  }
}