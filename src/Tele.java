public class Tele extends Tehnics {
    private String type = "Телевизоры";
    public int channel = 0;
    public void switchOn() {
        System.out.println("Проведите настройку каналов");
    }
    public void switchOff() {
        System.out.println("Телевизор будет выключен");
    }
    public void channelNext(){
        channel++;
        System.out.println(channel);
    }
    public void channelPrevious(){
        if(channel>0){
            channel--;
            System.out.println(channel);
        } else if (channel==0){
            System.out.println(channel);
        }
    }
}
