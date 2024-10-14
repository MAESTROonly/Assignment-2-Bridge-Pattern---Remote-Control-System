public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl basicRemoteForTV = new BasicRemote(tv);

        System.out.println("Using Basic Remote for TV:");
        basicRemoteForTV.powerOn();
        basicRemoteForTV.setChannel(2);
        basicRemoteForTV.setVolume(50);
        basicRemoteForTV.powerOff();

        Device dvd = new DVDDevice();
        RemoteControl advancedRemoteForDVD = new AdvancedRemote(dvd);

        System.out.println("\nUsing Advanced Remote for DVD:");
        advancedRemoteForDVD.powerOn();
        advancedRemoteForDVD.setChannel(1);
        advancedRemoteForDVD.setVolume(40);
        ((AdvancedRemote) advancedRemoteForDVD).mute();
        advancedRemoteForDVD.powerOff();

        Device soundSystem = new SoundSystemDevice();
        RemoteControl advancedRemoteForSoundSystem = new AdvancedRemote(soundSystem);

        System.out.println("\nUsing Advanced Remote for Sound System:");
        advancedRemoteForSoundSystem.powerOn();
        advancedRemoteForSoundSystem.setVolume(100);
        ((AdvancedRemote) advancedRemoteForSoundSystem).mute();
        advancedRemoteForSoundSystem.powerOff();
    }
}
