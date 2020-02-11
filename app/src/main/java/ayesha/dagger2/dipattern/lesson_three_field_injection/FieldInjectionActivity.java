package ayesha.dagger2.dipattern.lesson_three_field_injection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import ayesha.dagger2.R;

public class FieldInjectionActivity extends AppCompatActivity {

    @Inject
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_injection);
        DaggerMainViewModelComponent.create().inject(this);
        showToast(mainViewModel.getMessage());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
