public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    public void setChannel(int channel) {
        System.out.println("Basic Remote: Set channel");
        device.setChannel(channel);
    }

    public void setVolume(int volume) {
        System.out.println("Basic Remote: Set volume");
        device.setVolume(volume);
    }
}




