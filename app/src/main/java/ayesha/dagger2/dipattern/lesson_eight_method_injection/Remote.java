package ayesha.dagger2.dipattern.lesson_eight_method_injection;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote() {

    }

    public void setListener(Television television) {

        Log.d("Remote", "remote got some operation");

    }
}
