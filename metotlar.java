class Metotlar {
  public static void main(String[] args) {

    mesajVer("Can");
    System.out.println(topla(6,3));
    yuzdeon(7,8);



  }

  public static void mesajVer(String isim){
    System.out.println("Merhaba " + isim);
  }

  public static void hesapla(){
    System.out.println("Hesaplandı");
  }

  public static int topla(int sayi1 , int sayi2){
    int toplam = sayi1 + sayi2;
    return toplam;
  }

  public static void yuzdeon(int sayi1 , int sayi2){
    int toplam = topla(sayi1 , sayi2);
    double sonuc = (double)toplam * 10/100;
    System.out.println(sonuc);
  }

  public static double kredihesapla(double krediMiktarı){
    //hesaplar yapılır
    return 125000;
  }

}