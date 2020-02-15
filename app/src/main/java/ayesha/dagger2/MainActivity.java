package ayesha.dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ayesha.dagger2.dipattern.facade_pattern.FacadePatternActivity;
import ayesha.dagger2.dipattern.lesson_eight_method_injection.LessonEightActivity;
import ayesha.dagger2.dipattern.lesson_five_runtime_dependency.LessonFiveActivity;
import ayesha.dagger2.dipattern.lesson_four_binds.LessonFourActivity;
import ayesha.dagger2.dipattern.lesson_nine_singleton.LessonNineActivity;
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
    private Button btnMethodInjection;
    private Button btnSingleton;
    private Button btnFacade;

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
        btnMethodInjection = findViewById(R.id.btnMethodInjection);
        btnSingleton = findViewById(R.id.btnSingleton);
        btnFacade = findViewById(R.id.btnFacade);

        btnConstructionInjection.setOnClickListener(this);
        btnConstructionInjectionWithModule.setOnClickListener(this);
        btnFieldInjection.setOnClickListener(this);
        btnBindInjection.setOnClickListener(this);
        btnRuntimeInjection.setOnClickListener(this);
        btnRuntimeComponentInjection.setOnClickListener(this);
        btnNamedInjection.setOnClickListener(this);
        btnMethodInjection.setOnClickListener(this);
        btnSingleton.setOnClickListener(this);
        btnFacade.setOnClickListener(this);
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
                startActivity(new Intent(this, LessonFiveActivity.class));
                break;
            case R.id.btnRuntimeComponentInjection:
                startActivity(new Intent(this, LessonSixActivity.class));
                break;
            case R.id.btnNamedInjection:
                startActivity(new Intent(this, LessonSevenActivity.class));
                break;
            case R.id.btnMethodInjection:
                startActivity(new Intent(this, LessonEightActivity.class));
                break;
            case R.id.btnSingleton:
                startActivity(new Intent(this, LessonNineActivity.class));
                break;
            case R.id.btnFacade:
                startActivity(new Intent(this, FacadePatternActivity.class));
                break;
        }

    }
}
