class Refmantigi {
  public static void main(String[] args) {
    
    String[] sehirler1 = new String[]{"İzmir","Ankara","İstanbul"};

    String[] sehirler2 = new String[]{"Adana","Bursa","Denizli"};

    sehirler1 = sehirler2;
    sehirler1[0] = "Adana";
    System.out.println(sehirler2[0]);

    int sayi1 = 10;
    int sayi2 = 20;

    sayi1 = sayi2;
    sayi2 = 30;
    System.out.println(sayi1);

    
  }
}