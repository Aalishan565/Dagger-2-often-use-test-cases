package ayesha.dagger2.dipattern.lesson_two_constructor_injection_with_module;

import dagger.Component;

@Component(modules = {TicketModule.class})
public abstract class TicketComponent {

    // create a inject method which will take arg as in which it has to inject the fields
    public abstract void inject(LessonTwoActivity lessonTwoActivity);

}
