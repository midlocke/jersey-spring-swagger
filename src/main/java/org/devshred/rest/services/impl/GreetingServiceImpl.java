package org.devshred.rest.services.impl;

import org.devshred.rest.model.Greeting;
import org.devshred.rest.services.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created by lichao on 2018/3/21.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public Greeting greeting() {
        return new Greeting();
    }

    public Greeting greeting(final String name) {
        return new Greeting(name);
    }
}
