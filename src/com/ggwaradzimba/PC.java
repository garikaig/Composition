package com.ggwaradzimba;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void powerUp() {
        getTheCase().pressPowerButton();
        drawlogo();
    }

    private void drawlogo() {
        //fancy graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }
}
