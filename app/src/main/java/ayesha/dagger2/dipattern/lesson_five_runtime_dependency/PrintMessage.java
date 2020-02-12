package ayesha.dagger2.dipattern.lesson_five_runtime_dependency;

public class PrintMessage {

    private String message;

    public PrintMessage(String message) {
        this.message = message;
    }

    String printMessage() {
        return message;
    }
}
