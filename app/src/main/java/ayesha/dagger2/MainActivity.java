package ayesha.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    TicketRepository ticketRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ticketRepository = DaggerTicketComponent.create().getTickets();
        showToast(ticketRepository);
    }

    private void showToast(TicketRepository ticketRepository) {
        Toast.makeText(this, ticketRepository.getTickets(), Toast.LENGTH_LONG).show();
    }
}
