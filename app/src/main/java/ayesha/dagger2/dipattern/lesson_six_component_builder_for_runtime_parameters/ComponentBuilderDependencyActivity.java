package ayesha.dagger2.dipattern.lesson_six_component_builder_for_runtime_parameters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import ayesha.dagger2.R;

public class ComponentBuilderDependencyActivity extends AppCompatActivity {

    @Inject
    public Run run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_runtime_dependency);
        DaggerRunComponent.builder().setRunner("ComponentBuilderDependencyActivity").build().inject(this);
        showToast(run.objRunning());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
