class Main {
  public static int penjumlahan(int A, int B){
    return (A+B);
  }
  public static int pengurangan(int A, int B){
    return (B-A);
  }
  public static void main(String[] args) {
    int A = 10;
    int B = 50;
    do {
      if (penjumlahan(A,B) > 30){
        B = pengurangan(A,B);
      } else {
        perkalian(A,B);
      }
      B = pengurangan(5,B);
    } while(B>10);
    System.out.println(A * B);
  }
  public static void perkalian(int A, int B){
    A = A*B;
  }

}