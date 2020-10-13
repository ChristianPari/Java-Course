package com.christianpari;

public class TextBox extends UIControl {
    private  String text = "";

//    public TextBox() {
////        super should always be first within a constructor when needed
//        super(true);
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    //    overridden
    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
