package ayesha.dagger2.dipattern.lesson_nine_singleton;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component
public interface CollegeComponent {

   void inject(LessonNineActivity lessonNineActivity);
}
