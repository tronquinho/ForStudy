class Sample8_3 {
  public static void main(String[] args) {
    int[] num = {10, 20, 30};
    for (int i = 0; i < 4; i++) {
      try {
        System.out.print("num : " + num[i]);
        System.out.println(" : " + (i+1) + "loop count");
      } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception alert");
      } finally {
        System.out.println("-- run finally block");
      }
    }
    System.out.println("-- end --");
  }
}