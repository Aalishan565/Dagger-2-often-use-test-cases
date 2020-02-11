package ayesha.dagger2.dipattern.lesson_three_field_injection;

import javax.inject.Inject;

public class MainViewModel {
    @Inject
    public MainViewModel() {

    }

    public String getMessage() {
        return "This is field injection";
    }
}
