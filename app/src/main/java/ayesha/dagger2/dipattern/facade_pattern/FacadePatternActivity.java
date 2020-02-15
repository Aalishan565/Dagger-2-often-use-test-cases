package ayesha.dagger2.dipattern.facade_pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import ayesha.dagger2.R;

public class FacadePatternActivity extends AppCompatActivity {
    @Inject
    ShopKeeper shopKeeper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade_pattern);
        shopKeeper=DaggerShopKeeperComponent.create().getShopkeeper();
        shopKeeper.getIphoneDetail();
        shopKeeper.getSamsungDetail();

    }
}
