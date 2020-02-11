package ayesha.dagger2.dipattern.lesson_three_field_injection;

import dagger.Component;

@Component
public interface MainViewModelComponent {
    void inject(FieldInjectionActivity fieldInjectionActivity);
}
