package ayesha.dagger2.dipattern.lesson_five_runtime_dependency;

import dagger.Component;

@Component(modules = RunModule.class)
public interface RunComponent {

    void inject(RuntimeDependencyActivity runtimeDependencyActivity);
}
