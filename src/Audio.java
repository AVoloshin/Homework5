public class Audio extends Tehnics {

    private String type = "Аудиотехника";
    public int volume = 0;
    public void switchOn() {
        System.out.println("Добро пожаловать");
    }
    public void switchOff() {
        System.out.println("До свидания");
    }
    public void volumeUp(){
        System.out.println("Увел. звук");
    }
    public void volumeDown(){
        System.out.println("Умен. звук");
    }

}
