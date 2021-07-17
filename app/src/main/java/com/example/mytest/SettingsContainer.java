package com.example.mytest;

public class SettingsContainer {

    private static SettingsContainer sCont = new SettingsContainer();
    private String fontSize;
    private String width;
    private String height;
    private int rows;
    private boolean allowEdit;

    private SettingsContainer () {
        fontSize = "18sp";
        width = "390dp";
        height = "50dp";
        rows = 1;
        allowEdit = true;
    }

    public static SettingsContainer getInstance() {
        return sCont;
    }

    public void setFontSize(String val){
         fontSize = val;
    }

    public String getFontSize() {
        return fontSize;
    }
    public void setWidth(String val){
        width = val;
    }

    public String getWidth(){
        return width;
    }
    public void setHeight(String val){
        height = val;
    }

    public String getHeight(){
        return height;
    }
    public void setRows(int val){
        rows = val;
    }

    public int getRows(){
        return rows;
    }

    public void setEditAllowed(boolean val){
        allowEdit = val;
    }

    public boolean getEditAllowed(){
        return allowEdit;
    }
}
