package restuarant.repositories;

import restuarant.models.WaitListPosition;

import java.util.List;

public interface WaitListPositionRepository {
    WaitListPosition save(WaitListPosition waitListPosition);

    List<WaitListPosition> findAll();

    WaitListPosition delete(WaitListPosition waitListPosition);
}
