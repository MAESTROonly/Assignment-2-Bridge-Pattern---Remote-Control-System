public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Advanced Remote: Mute");
        device.setVolume(0);
    }

    public void setChannel(int channel) {
        System.out.println("Advanced Remote: Set channel");
        device.setChannel(channel);
    }

    public void setVolume(int volume) {
        System.out.println("Advanced Remote: Set volume");
        device.setVolume(volume);
    }
}
