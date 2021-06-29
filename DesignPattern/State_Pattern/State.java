package DesignPattern.State_Pattern;

public interface State {
    public void onGreenLight();
    public void onYellowLight();
    public void onRedLight();
}