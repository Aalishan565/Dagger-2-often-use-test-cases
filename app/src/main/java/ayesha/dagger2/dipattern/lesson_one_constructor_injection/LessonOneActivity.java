package ayesha.dagger2.dipattern.lesson_one_constructor_injection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import ayesha.dagger2.R;

public class LessonOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);
        // Getting car instance here
        Car car = DaggerCarComponent.create().getCar();
        showToast(car.run());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
