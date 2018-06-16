package pl.coderslab.repositories;

import pl.coderslab.entity.User;

public interface DriverRepository {

    User findByUsername(String username);
}
