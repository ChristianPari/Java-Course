package com.christianpari;

public class TextBox {
    public String text = ""; // Field

    public void setText(String text) { // Setter
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
