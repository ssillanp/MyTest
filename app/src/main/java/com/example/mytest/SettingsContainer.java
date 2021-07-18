package com.example.mytest;

public class SettingsContainer {

    private static SettingsContainer sCont = new SettingsContainer();
    private float fontSize;
    private int width;
    private int height;
    private int rows;
    private boolean allowEdit;
    private String viewText;
    private String editText;
    private String settingsTextToDisplay;

    private SettingsContainer() {
        fontSize = 18f;
        width = 390;
        height = 50;
        rows = 1;
        allowEdit = true;
        viewText = "Hello World!";
        editText = "Your text here";
    }

    public static SettingsContainer getInstance() {
        return sCont;
    }

    public void setFontSize(int val) {
        this.fontSize = (float) val;
    }

    public float getFontSize() {
        return fontSize;
    }

    public void setWidth(int val) {
        this.width =  val;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int val) {
        this.height = val;
    }

    public int getHeight() {
        return height;
    }

    public void setRows(int val) {
        this.rows = val;
    }

    public int getRows() {
        return rows;
    }

    public void setEditAllowed(boolean val) {
        this.allowEdit = val;
    }

    public boolean getEditAllowed() {
        return allowEdit;
    }

    public String getViewText() {
        return viewText;
    }

    public void setViewText(String viewText) {
        this.viewText = viewText;
    }

    public String getEditText() {
        return editText;
    }

    public void setEditText(String editText) {
        this.editText = editText;
    }

    public String getSettingsText() {
        return settingsTextToDisplay;
    }

    public void setSettingsTextToDisplay(String settingsTextToDisplay) {
        this.settingsTextToDisplay = settingsTextToDisplay;
    }
}
