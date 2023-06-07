package com.sotoon;

public class Model {
    private Boolean active = true;
    int count = 50;

//    Model(boolean active){
//        this.active = active;
//    }

    public void revoke(Boolean value) {
        this.active = value;
//        this.active = false;
    }

    public void change(int value) {
        count += value;
    }

    public Model reset() {
        this.active = !this.active;
        return this;
    }

    public boolean isActive() {
        return this.active;
    }

}


