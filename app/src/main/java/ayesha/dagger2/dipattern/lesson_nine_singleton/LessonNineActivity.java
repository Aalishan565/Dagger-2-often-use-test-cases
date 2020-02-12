package ayesha.dagger2.dipattern.lesson_nine_singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import ayesha.dagger2.R;

public class LessonNineActivity extends AppCompatActivity {

    @Inject
    public College college1,college2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_nine);
        DaggerCollegeComponent.create().inject(this);
        college1.getInstance();
        college2.getInstance();
    }
}
