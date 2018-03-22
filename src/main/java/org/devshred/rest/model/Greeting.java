package org.devshred.rest.model;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lichao on 2018/3/21.
 */
@ApiModel(value = "A greeting a day keeps all sorrows away.")
@XmlRootElement(name = "greeting")
public class Greeting {
    @XmlElement(name = "message")
    @ApiModelProperty(value = "Greeting message", required = true)
    private final String message;

    public Greeting() {
        message = "Hello!";
    }

    public Greeting(final String name) {
        message = String.format("Hello %s!", name);
    }
}
