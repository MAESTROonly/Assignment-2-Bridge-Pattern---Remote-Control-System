public class DVDDevice implements Device {
    private int volume;
    private int chapter;

    @Override
    public void powerOn() {
        System.out.println("DVD Player is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD Player is OFF");
    }

    @Override
    public void setChannel(int chapter) {
        this.chapter = chapter;
        System.out.println("DVD playing chapter " + chapter);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("DVD volume set to " + volume);
    }
}





