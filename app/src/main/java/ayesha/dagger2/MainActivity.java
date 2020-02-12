package ayesha.dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ayesha.dagger2.dipattern.lesson_five_runtime_dependency.RuntimeDependencyActivity;
import ayesha.dagger2.dipattern.lesson_four_binds.LessonFourActivity;
import ayesha.dagger2.dipattern.lesson_one_constructor_injection.LessonOneActivity;
import ayesha.dagger2.dipattern.lesson_seven_named_param.LessonSevenActivity;
import ayesha.dagger2.dipattern.lesson_six_component_builder_for_runtime_parameters.LessonSixActivity;
import ayesha.dagger2.dipattern.lesson_three_field_injection.LessonThreeActivity;
import ayesha.dagger2.dipattern.lesson_two_constructor_injection_with_module.LessonTwoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnConstructionInjection;
    private Button btnConstructionInjectionWithModule;
    private Button btnFieldInjection;
    private Button btnBindInjection;
    private Button btnRuntimeInjection;
    private Button btnRuntimeComponentInjection;
    private Button btnNamedInjection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConstructionInjection = findViewById(R.id.btnConstructionInjection);
        btnConstructionInjectionWithModule = findViewById(R.id.btnConstructionInjectionWithModule);
        btnFieldInjection = findViewById(R.id.btnFieldInjection);
        btnBindInjection = findViewById(R.id.btnBindInjection);
        btnRuntimeInjection = findViewById(R.id.btnRuntimeInjection);
        btnRuntimeComponentInjection = findViewById(R.id.btnRuntimeComponentInjection);
        btnNamedInjection = findViewById(R.id.btnNamedInjection);

        btnConstructionInjection.setOnClickListener(this);
        btnConstructionInjectionWithModule.setOnClickListener(this);
        btnFieldInjection.setOnClickListener(this);
        btnBindInjection.setOnClickListener(this);
        btnRuntimeInjection.setOnClickListener(this);
        btnRuntimeComponentInjection.setOnClickListener(this);
        btnNamedInjection.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnConstructionInjection:
                startActivity(new Intent(this, LessonOneActivity.class));
                break;
            case R.id.btnConstructionInjectionWithModule:
                startActivity(new Intent(this, LessonTwoActivity.class));
                break;
            case R.id.btnFieldInjection:
                startActivity(new Intent(this, LessonThreeActivity.class));
                break;
            case R.id.btnBindInjection:
                startActivity(new Intent(this, LessonFourActivity.class));
                break;
            case R.id.btnRuntimeInjection:
                startActivity(new Intent(this, RuntimeDependencyActivity.class));
                break;
                case R.id.btnRuntimeComponentInjection:
                startActivity(new Intent(this, LessonSixActivity.class));
                break;
                case R.id.btnNamedInjection:
                startActivity(new Intent(this, LessonSevenActivity.class));
                break;
        }

    }
}
