package ayesha.dagger2.dipattern.lesson_one_constructor_injection;

import android.util.Log;

import javax.inject.Inject;

public class Engine {

    @Inject
    public Engine() {
        Log.d("Car", "Engine()");
    }
}
