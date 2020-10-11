package com.christianpari;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAdress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAdress(String address) {
        return "127.0.0.1";
    }
}
