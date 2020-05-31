import java.util.ArrayList;
import java.util.Collections;

class Main {
  public static void main(String[] args) {

    /*CreditManager creditManager = new CreditManager();
    creditManager.add();
    creditManager.calculate();


    MortgageManager mortgageManager = new MortgageManager();
    MortgageManager.add();

    CreditManager[] credits = new CreditManager[2];
    credits[0] = new MortgageManager();
    credits[0] = new VehicleManager();

    for (int i = 0 ; i<credits.length ; i++){
      credits[i].calculate();
    } */

    ArrayList<ICreditManager> credits = new ArrayList<ICreditManager>();
    credits.add(new IMortgageManager());
    credits.add(new IVehicleManager());

    for (ICreditManager credit : credits){
      credit.calculate();
    }

  }
}