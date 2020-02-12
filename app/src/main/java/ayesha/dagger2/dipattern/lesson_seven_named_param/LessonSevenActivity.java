package ayesha.dagger2.dipattern.lesson_seven_named_param;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import ayesha.dagger2.R;

public class LessonSevenActivity extends AppCompatActivity {

    @Inject
    public Login login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_seven);
        DaggerLoginComponent.builder().setUserName("Aalishan ").setPassword("Ansari").build().inject(this);
        showToast(login.getUserInfo());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
