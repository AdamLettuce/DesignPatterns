package designpatterns.command;


public class SampleObjectCommand implements Command {

    private SampleObject sampleObject;

    public SampleObjectCommand(SampleObject sampleObject) {
        this.sampleObject = sampleObject;
    }

    @Override
    public void execute() {
        sampleObject.operate();
    }
}
