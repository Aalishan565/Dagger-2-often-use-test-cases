package ayesha.dagger2.dipattern.lesson_one_constructor_injection;

import dagger.Component;

// Need to make this interface by which we can provide car instance to activity
@Component
public interface CarComponent {

    // Returns car instance
    Car getCar();


}
