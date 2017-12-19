package com.iot.yagnik.iotdatacontroller;

/**
 * Created by Yagnik on 2017-12-17.
 */
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Config {

    private int delay;

    public Config() {

    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
