package org.devshred.rest.services;

import org.devshred.rest.model.Greeting;

/**
 * Created by lichao on 2018/3/21.
 */
public interface GreetingService {
    Greeting greeting();

    Greeting greeting(String name);
}
