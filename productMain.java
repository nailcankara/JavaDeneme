class ProductMain {
  public static void main(String[] args) {


    Product product1 = new Product();
    product1.setName("Laptop");

    Product product2 = new Product();
    product2.setName("Mouse");

    Product[] urunler = new Product[]{product1,product2};

    for (int i=0 ; i<urunler.length ; i++){
      System.out.println(urunler[i].getName());
    }
  }
}