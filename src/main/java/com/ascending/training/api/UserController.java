package com.ascending.training.api;

import com.ascending.training.domain.User;
import com.ascending.training.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@ResponseBody
@RequestMapping(value = {"/api/users","/api/user"},produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUserList() {
        logger.debug("list users");
        return userRepository.findAll();
    }

}
