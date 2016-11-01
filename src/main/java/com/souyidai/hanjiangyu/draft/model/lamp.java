package com.souyidai.hanjiangyu.draft.model;

/**
 * Created by hanjiangyu on 2016/11/1.
 */
public class Lamp {
    //0代表关，1代表开
    private int state=1;
    private int id;

    public void press(){
        if(state==0) state=1;
        else if(state==1) state=0;
        else state=0;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
