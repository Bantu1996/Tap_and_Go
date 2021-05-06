package TapAndGo.Client;

import TapAndGo.TapAndGoCard;

public class ClientCard {
    public  static void  main(String[] args) {
       TapAndGoCard tapAndGoCard = new TapAndGoCard(500);
       tapAndGoCard.deposit(750);
       System.out.println(tapAndGoCard.getBalance());

       try {
           tapAndGoCard.pay(350);
           tapAndGoCard.deposit(50);
           tapAndGoCard.pay(15);
       }catch (Exception ex) {
           ex.printStackTrace();
       }finally {
           System.out.println(tapAndGoCard.getBalance());

       }

    }
}
