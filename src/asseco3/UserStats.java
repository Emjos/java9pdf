package asseco3;

import java.util.Optional;

public class UserStats implements VisitCounterRepository{

    Optional<Long>  visitCount;


    @Override
    public Optional<VisitCounter> visitVounterRepo() {



        return Optional.empty();
    }
}
