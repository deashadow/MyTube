package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Renee's 8th Birthday");
        video.setUser(new User("ron@domain.com"));

        var processor = new VideoProcessor(
            new XVideoEncoder(),
            new SqlVideoDatabase(),
            new EmailService()
        );
        processor.process(video);
    }
}
