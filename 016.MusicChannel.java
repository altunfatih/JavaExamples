package TVSimulation;

public class MusicChannel extends Channel{

    private String musicType;

    public MusicChannel(String name, int channelNo, String musicType) {
        super(name, channelNo);
        this.musicType = musicType;
    }
}
