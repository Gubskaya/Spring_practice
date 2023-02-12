package springTest.factoryMethodTest;

import springTest.lesson3.Music;

public class MusicPlayer {
    private springTest.lesson3.Music music;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    //IoC
    public MusicPlayer(springTest.lesson3.Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music){
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
