package ayesha.dagger2.dipattern.lesson_five_runtime_dependency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import ayesha.dagger2.R;
import dagger.Provides;

public class RuntimeDependencyActivity extends AppCompatActivity {

    @Inject
    public Run run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runtime_dependency);
        DaggerRunComponent.builder().runModule(new RunModule("Car is running..")).build().inject(this);
        showToast(run.objRunning());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
