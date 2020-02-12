package ayesha.dagger2.dipattern.lesson_four_binds;

import dagger.Component;

@Component(modules = RealConnectionModule.class)
public interface ConnectionComponent {

    void inject(LessonFourActivity lessonFourActivity);
}
