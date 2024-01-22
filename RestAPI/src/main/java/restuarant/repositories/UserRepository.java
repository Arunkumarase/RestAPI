package restuarant.repositories;

import restuarant.models.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(long id);
}
