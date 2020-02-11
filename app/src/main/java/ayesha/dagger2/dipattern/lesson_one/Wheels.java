package ayesha.dagger2.dipattern.lesson_one;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {

    @Inject
    public Wheels() {
        Log.d("Car", "Wheel()");

    }
}
