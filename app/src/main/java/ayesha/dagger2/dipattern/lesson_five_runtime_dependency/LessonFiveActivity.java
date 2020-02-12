package ayesha.dagger2.dipattern.lesson_five_runtime_dependency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import ayesha.dagger2.R;

public class LessonFiveActivity extends AppCompatActivity {

    @Inject
    public PrintMessage printMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_five);
        DaggerPrintMessageComponent.builder().runModule(new RunModule("Give My message to print ..")).build().inject(this);
        showToast(printMessage.printMessage());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
