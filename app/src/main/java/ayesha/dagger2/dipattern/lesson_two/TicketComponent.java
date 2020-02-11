package ayesha.dagger2.dipattern.lesson_two;

import ayesha.dagger2.MainActivity;
import dagger.Component;

@Component(modules = {TicketModule.class})
public abstract class TicketComponent {

   public abstract void inject(MainActivity mainActivity);

}
