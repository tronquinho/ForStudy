import java.time.LocalDate;

public class Sample7_12 {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2015, 10, 1);
    System.out.println("date              : " + date);
    System.out.println("3days later       : " + date.plusDays(3));
    System.out.println("5months later     : " + date.plusMonths(5));
    System.out.println("2weeks later      : " + date.plusWeeks(2));
    System.out.println("10years later     : " + date.plusYears(10));
    System.out.println("date              : " + date);
  }
}