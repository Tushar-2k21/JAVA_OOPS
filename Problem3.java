//INTERFACES



interface TVRemote{
  void volume();
  void changechannel();

}
interface SmartTvRemote extends TVRemote{
    void playyoutube();
    void openwifi();
}
class TV implements TVRemote{
    public void volume(){
        System.out.println("ALLOWING VOLUME ACCESS");
    };
    public void playyoutube(){
        System.out.println("PLAYING YOUTUBE");
    };
    public void changechannel() {
        System.out.println("CHANGING CHANNEL");


    };
    public void openwifi(){
        System.out.println("OPENING WIFI");

    };
}




public class Problem3 {
    public static void main(String[] args) {
        TV airtel = new TV() ;
        airtel.changechannel();
        airtel.openwifi();
        airtel.playyoutube();
        airtel.volume();



             }
}
