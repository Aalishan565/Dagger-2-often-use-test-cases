package ayesha.dagger2.dipattern.lesson_eight_method_injection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import ayesha.dagger2.R;

public class LessonEightActivity extends AppCompatActivity {
    @Inject Television television;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_eight);
        television=DaggerTvComponent.create().getTelevision();

    }

}
