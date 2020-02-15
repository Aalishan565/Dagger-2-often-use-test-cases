package ayesha.dagger2.dipattern.facade_pattern;

import android.util.Log;

import javax.inject.Inject;

public class Samsung implements MobileShop {

    @Inject
    public Samsung() {

    }

    @Override
    public void getModelPrize() {
        Log.d("Facade Pattern", "Samsung Prize is 4000");
    }

    @Override
    public void getModelName() {
        Log.d("Facade Pattern", "This is Samsung phone");

    }
}
