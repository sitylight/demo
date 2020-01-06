// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-02, derrick, creation
// ============================================================================
package com.example.demo.usecase.user;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.usecase.NoOutputUseCase;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author derrick
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Transactional(rollbackOn = Exception.class)
public class SaveUseCase implements NoOutputUseCase<User> {
    private Logger logger = LoggerFactory.getLogger(SaveUseCase.class);

    private final UserService userService;

    @Override
    public void execute(final User user) {
        final Optional<User> userOptional = userService.getUserByName(user.getName());
        if (userOptional.isPresent()) {
            logger.debug("update user [ {} ]", user.getName());
            user.setId(userOptional.get().getId());
        } else {
            logger.debug("save new user [ {} ]", user.getName());
            user.setId(StringUtils.EMPTY);
        }
        userService.saveUser(user);

    }
}
