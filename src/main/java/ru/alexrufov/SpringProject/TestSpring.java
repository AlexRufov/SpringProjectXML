package ru.alexrufov.SpringProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusicList();

        System.out.println(musicPlayer.getPlayerName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
