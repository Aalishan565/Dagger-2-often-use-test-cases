package ayesha.dagger2.dipattern.lesson_two_constructor_injection_with_module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import ayesha.dagger2.R;

public class ConstructorInjectionWithModuleActivity extends AppCompatActivity {

    // Want to inject ticket which is not local or it is not accessible for modification or some 3rd party
    @Inject
    TicketRepository ticketRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construction_injection_with_module);

        // Initializing the ticket obj
        DaggerTicketComponent.create().inject(this);
        showToast(ticketRepository.getTickets());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
