package designpatterns.command;


public class SampleObject {
    private String name;

    public SampleObject(String name) {
        this.name = name;
    }

    public void operate() {
        System.out.println(String.format("%s is operating.", name));
    }
}
