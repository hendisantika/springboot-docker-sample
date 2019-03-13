package com.hendisantika.springbootdockersample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-docker-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-14
 * Time: 06:05
 */

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping
    String index() throws UnknownHostException {
        return "Hello Docker Wordl! " + new Date() + " " + InetAddress.getLocalHost().getHostAddress();
    }
}
