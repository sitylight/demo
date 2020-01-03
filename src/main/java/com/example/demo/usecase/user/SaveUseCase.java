// Copyright (c) 2020 Cityline Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION 2.0.19
// ============================================================================
// CHANGE LOG
// 2.0.19 : 2020-01-02, derrick, creation
// ============================================================================
package com.example.demo.usecase.user;

import com.example.demo.exception.DemoException;
import com.example.demo.exception.ErrorCode;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.usecase.NoOutputUseCase;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author derrick
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SaveUseCase implements NoOutputUseCase<User> {
    private final UserService userService;

    @Override
    @Transactional(rollbackOn = Exception.class)
    public void execute(User user) throws Exception {
        Optional<User> userOptional = userService.getUserByName(user.getName());
        if (userOptional.isPresent()) {
            user.setId(userOptional.get().getId());
        } else {
            user.setId(StringUtils.EMPTY);
        }
        userService.saveUser(user);
        throw new DemoException(ErrorCode.INNER_ERROR.getCode(), ErrorCode.INNER_ERROR.getMessage());
    }
}
