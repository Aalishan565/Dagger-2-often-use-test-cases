package ayesha.dagger2.dipattern.lesson_eight_method_injection;

import javax.inject.Inject;

public class Television {

    @Inject
    public Television() {
    }

    @Inject
    public void enableDisableMute(Remote remote) {
        remote.setListener(this);
    }

}
