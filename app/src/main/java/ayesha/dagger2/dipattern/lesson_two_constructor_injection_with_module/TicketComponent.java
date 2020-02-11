package ayesha.dagger2.dipattern.lesson_two_constructor_injection_with_module;

import dagger.Component;

@Component(modules = {TicketModule.class})
public abstract class TicketComponent {

    public abstract void inject(ConstructorInjectionWithModuleActivity constructorInjectionWithModuleActivity);

}
