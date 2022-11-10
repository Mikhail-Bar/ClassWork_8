package com.company.simple;

public class Mixer {
    double coldTemp = 15, hotTemp = 60;
    int cold = 0, hot = 0;

    public void setValues(int cold, int hot) {
        this.cold = cold;
        this.hot = hot;
    }

    public double getTemp() {
        return (cold * coldTemp + hot * hotTemp) / (cold + hot);
    }

}
