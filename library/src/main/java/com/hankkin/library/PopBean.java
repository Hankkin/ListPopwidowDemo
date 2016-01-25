package com.hankkin.library;

/**
 * Created by Hankkin on 16/1/25.
 */
public class PopBean {
    private String title;
    private int icon_res;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon_res() {
        return icon_res;
    }

    public void setIcon_res(int icon_res) {
        this.icon_res = icon_res;
    }

    public PopBean(String title, int icon_res) {
        this.title = title;
        this.icon_res = icon_res;
    }
}
