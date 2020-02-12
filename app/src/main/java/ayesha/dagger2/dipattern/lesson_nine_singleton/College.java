package ayesha.dagger2.dipattern.lesson_nine_singleton;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class College {

    @Inject
    public College() {

    }

    public void getInstance() {
        Log.d("College", "college " + this);
    }
}
