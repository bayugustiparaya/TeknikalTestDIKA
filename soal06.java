class Maind {
  public static void main(String[] args) {
    String strSaldo = "1,000,000.00";
    String strTemp = "Rp " + strSaldo.replace("," , "");
    strTemp = strTemp.replace(".",";");
    String[] arrTemp = strTemp.split(";");
    System.out.println(arrTemp[0]+".00");
  }
}