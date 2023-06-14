package Structural.Adapter;

import Behavioural.memento.Memento;

public interface IVideoPlayer {
    public void playvideo(String filename);
    public void playaudio(String filename);
}

class MP4Player implements IVideoPlayer{


    @Override
    public void playvideo(String filename) {
        System.out.println(filename+" is played by MP4Player");
    }

    @Override
    public void playaudio(String filename) {
        System.out.println(filename+" is played by MP4Player");
    }


}
class AVIPlayer implements IVideoPlayer{
    @Override
    public void playvideo(String filename) {
        System.out.println(filename+" is played by AVI");
    }

    @Override
    public void playaudio(String filename) {
        System.out.println(filename+" is played by AVI");
    }

}
class MP3Adapter implements IVideoPlayer{
    private MP3Player m=new MP3Player();

    @Override
    public void playaudio(String filename) {
        m.play(filename);
    }

    @Override
    public void playvideo(String filename) {
        System.out.println(filename+" is played randomly");
    }

}

class MediaPlayer {

    IVideoPlayer vp;

    public void playFile(String filename){
        vp=createPlayer(filename);
        vp.playaudio(filename);
        vp.playvideo(filename);
    }
    private IVideoPlayer createPlayer(String filename){
        String[] newString= filename.split(" \\.");
        String extension= newString[1];

        if(extension.equalsIgnoreCase("mp3")){
            return new MP3Adapter();
        }
        else if(extension.equalsIgnoreCase("avi"))return new AVIPlayer();
        else if(extension.equalsIgnoreCase("mp4"))return new MP4Player();
        else return null;
    }

}
