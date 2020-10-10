package com.christianpari;

public class VideoEncoder implements canEncodeVideo {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
