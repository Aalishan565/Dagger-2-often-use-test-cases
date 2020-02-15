package ayesha.dagger2.dipattern.facade_pattern;


import android.util.Log;

import javax.inject.Inject;

public class Iphone implements MobileShop {
    @Inject
    public Iphone() {

    }

    @Override
    public void getModelPrize() {
        Log.d("Facade Pattern", "Iphone Prize is 5000");
    }

    @Override
    public void getModelName() {
        Log.d("Facade Pattern", "This is Iphone phone");
    }
}
