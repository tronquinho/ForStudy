class Room { }
interface Facilities { }
class ClassRoom extends Room implements Facilities { }
class Lab extends ClassRoom { }
class LectureHall extends ClassRoom { }
class Auditorium extends ClassRoom { }
public class pra0615 {
  public static void main(String[] args){
    LectureHall lh = new LectureHall();
    Auditorium a1;
    Facilities f1;

    f1 = lh;
    a1 = (Auditorium) f1;
  }
}
