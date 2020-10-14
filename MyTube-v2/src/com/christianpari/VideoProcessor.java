package com.christianpari;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

//    initializing the private fields via construction injection
    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());
    }
}

