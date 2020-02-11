package ayesha.dagger2.dipattern.lesson_one_constructor_injection;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {

    // Need to tell dagger I want to inject this constructor of Engine class
    @Inject
    public Wheels() {
        Log.d("Car", "Wheel()");

    }
}
