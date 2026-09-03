public class Main{
    public static void main(String[] args){
        TV tv1=new TV(350,60,false);
        tv1.turnOn();
        tv1.upChannel();
        tv1.downChannel();
        tv1.setChannel(344);
        tv1.volumeDown();
        tv1.volumeUp();
        tv1.turnOn();
        tv1.turnOff();
    }
}
