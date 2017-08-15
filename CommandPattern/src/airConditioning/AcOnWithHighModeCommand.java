package airConditioning;

import base.Command;

public class AcOnWithHighModeCommand implements Command {

    private Ac ac;

    private int prevMode;

    public AcOnWithHighModeCommand(Ac ac) {
        prevMode = ac.getMode();
        this.ac = ac;
        ac.highMode();
    }

    @Override
    public void execute() {
        ac.on();
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
