package ayesha.dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ayesha.dagger2.dipattern.lesson_one_constructor_injection.ConstructorInjectionActivity;
import ayesha.dagger2.dipattern.lesson_three_field_injection.FieldInjectionActivity;
import ayesha.dagger2.dipattern.lesson_two_constructor_injection_with_module.ConstructorInjectionWithModuleActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnConstructionInjection;
    private Button btnConstructionInjectionWithModule;
    private Button btnFieldInjection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConstructionInjection = findViewById(R.id.btnConstructionInjection);
        btnConstructionInjectionWithModule = findViewById(R.id.btnConstructionInjectionWithModule);
        btnFieldInjection = findViewById(R.id.btnFieldInjection);

        btnConstructionInjection.setOnClickListener(this);
        btnConstructionInjectionWithModule.setOnClickListener(this);
        btnFieldInjection.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnConstructionInjection:
                startActivity(new Intent(this, ConstructorInjectionActivity.class));
                break;
            case R.id.btnConstructionInjectionWithModule:
                startActivity(new Intent(this, ConstructorInjectionWithModuleActivity.class));
                break;
            case R.id.btnFieldInjection:
                startActivity(new Intent(this, FieldInjectionActivity.class));
                break;
        }

    }
}
