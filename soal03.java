class Mainc {
  public static void main(String[] args) {
    int A = 10;
    int B = 2;
    int C = 0;
    int i = 1;
    do {
      if (A % B == 0){
        C = C + 2;
      } else {
        C = C + 1;
      }
      A = A - 1;
      System.out.println("iterasi = "+i+", A = "+A+", B = "+B+", C = "+C);
      i++;
    } while (A >= 0);

    System.out.println("Hasil akhir isi soal 3 = " +C);
  }
}