package com.christianpari;

public class VideoProcessor {
    private canEncodeVideo encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    public VideoProcessor(
            canEncodeVideo encoder,
            VideoDatabase database,
            NotificationService notificationService
            ) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.sendEmail(video.getUser());
    }
}
