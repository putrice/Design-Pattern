package airConditioning;

import base.Command;

public class AcOffCommand implements Command {

    private int prevMode;

    private Ac ac;

    public AcOffCommand(Ac ac) {
        prevMode = ac.getMode();
        this.ac = ac;
        ac.offMode();
    }

    @Override
    public void execute() {
        ac.off();
    }

    @Override
    public void undo() {
        switch (prevMode) {
            case Ac.HIGH_MODE:
                ac.highMode();
                break;
            case Ac.MEDIUM_MODE:
                ac.mediumMode();
                break;
            case Ac.LOW_MODE:
                ac.lowMode();
                break;
            default:
                ac.offMode();
                break;
        }

        if (prevMode != Ac.OFF_MODE) {
            ac.on();
        } else {
            ac.off();
        }
    }
}
