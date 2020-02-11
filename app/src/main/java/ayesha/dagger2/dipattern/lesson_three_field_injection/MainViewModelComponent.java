package ayesha.dagger2.dipattern.lesson_three_field_injection;

import dagger.Component;

@Component
public interface MainViewModelComponent {

    // create a inject method which will take arg as in which it has to inject the fields
    void inject(FieldInjectionActivity fieldInjectionActivity);
}
