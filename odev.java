class Odev {
  public static void main(String[] args) {

    int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,10};
    int istenilen = 3;
    boolean varmilan = false;
    varmilan = varmi(sayilar,istenilen);
    System.out.println(varmilan);
    


  }

  public static boolean varmi(int[] dizi , int istenilen){
    
    for(int i : dizi){
      if(i==istenilen){
        System.out.println(i);
        return true;}
    }
    return false;
    
  }


}