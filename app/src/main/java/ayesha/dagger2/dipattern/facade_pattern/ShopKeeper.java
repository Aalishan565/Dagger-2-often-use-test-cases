package ayesha.dagger2.dipattern.facade_pattern;

import javax.inject.Inject;

public class ShopKeeper {

    @Inject
    Samsung samsung;
    @Inject
    Iphone iphone;

    @Inject
    public ShopKeeper() {

    }

    public void getIphoneDetail() {
        iphone.getModelName();
        iphone.getModelPrize();
    }

    public void getSamsungDetail() {
        samsung.getModelName();
        samsung.getModelPrize();
    }
}
