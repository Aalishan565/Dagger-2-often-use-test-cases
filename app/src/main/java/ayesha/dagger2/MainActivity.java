package ayesha.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import ayesha.dagger2.dipattern.lesson_one.Car;
import ayesha.dagger2.dipattern.lesson_one.DaggerCarComponent;
import ayesha.dagger2.dipattern.lesson_two.DaggerTicketComponent;
import ayesha.dagger2.dipattern.lesson_two.TicketRepository;

public class MainActivity extends AppCompatActivity {

    @Inject
    TicketRepository ticketRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerTicketComponent.create().inject(this);
        Car car = DaggerCarComponent.create().getCar();
        Log.d("Car", "onCreate: car" + car.run());
        showToast(ticketRepository);
    }

    private void showToast(TicketRepository ticketRepository) {
        Toast.makeText(this, ticketRepository.getTickets(), Toast.LENGTH_LONG).show();
    }
}
