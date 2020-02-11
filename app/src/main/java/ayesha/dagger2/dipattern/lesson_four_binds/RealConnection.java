package ayesha.dagger2.dipattern.lesson_four_binds;

import javax.inject.Inject;

public class RealConnection implements Connection {

    @Inject
    public RealConnection() {
    }

    @Override
    public String doRequest() {
        return "Real Connection";
    }
}
