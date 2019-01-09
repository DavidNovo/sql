package headfirst.modules;

import com.google.inject.AbstractModule;
import headfirst.dataAccess.EchoRepo;
import headfirst.dataAccess.interfaces.DbRepo;

public class DataAccessModule extends AbstractModule {

    @Override protected void configure() {
        bind(DbRepo.class).to(EchoRepo.class);
    }
}
