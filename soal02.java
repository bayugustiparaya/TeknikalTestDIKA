class Mainb {
  public static void main(String[] args) {
    int A = 1;
    int B = 5;
    for (int i = 1; i <= 5; i++){
      if (A % 2 == 0){
        System.out.println("good");
      }
      int C = B * 2 % 2;
      if (C == 0) {
        System.out.println("verry good");
      }
      A++;
      B--;
    }
  }
}