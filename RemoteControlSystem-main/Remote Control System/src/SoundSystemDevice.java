public class SoundSystemDevice implements Device {
    private int volume;

    @Override
    public void powerOn() {
        System.out.println("Sound System is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound System is OFF");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound System does not support channel setting");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound System volume set to " + volume);
    }
}
