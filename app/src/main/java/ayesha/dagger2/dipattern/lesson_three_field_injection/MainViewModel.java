package ayesha.dagger2.dipattern.lesson_three_field_injection;

import javax.inject.Inject;

public class MainViewModel {

    // Need to tell dagger I want to inject this constructor of MainViewModel class
    @Inject
    public MainViewModel() {

    }

    public String getMessage() {
        return "This is field injection";
    }
}
