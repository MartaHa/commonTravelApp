package pl.coderslab.web;

import pl.coderslab.repositories.UserRepository;

public class GoodbyController {

    private final UserRepository userRepository;

    public GoodbyController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}


