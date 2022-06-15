public class CeilingFanHighCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;
    @Override
    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.High) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.Medium) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.Low) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.Off) {
            ceilingFan.off();
        }

    }
}
