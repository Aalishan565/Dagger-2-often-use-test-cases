package ayesha.dagger2.dipattern.lesson_three_field_injection;

import javax.inject.Inject;

public class Message {

    // Need to tell dagger I want to inject this constructor of Message class
    @Inject
    public Message() {

    }

    public String getMessage() {
        return "This is field injection";
    }
}
