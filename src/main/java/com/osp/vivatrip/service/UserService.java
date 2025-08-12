package com.osp.vivatrip.service;

import com.osp.vivatrip.dto.request.UserCreationRequest;
import com.osp.vivatrip.dto.request.UserUpdateRequest;
import com.osp.vivatrip.entity.User;
import com.osp.vivatrip.exception.AppException;
import com.osp.vivatrip.exception.ErrorCode;
import com.osp.vivatrip.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(UserCreationRequest request){
        User user = new User();

        if(userRepository.existsByUsername(request.getUsername()))
            throw new AppException(ErrorCode.USER_EXISTED);

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setBod(request.getBod());
        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(String id){
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser(String userId, UserUpdateRequest request){
        User user = getUser(userId);
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setBod(request.getBod());

        return userRepository.save(user);
    }

    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }
}
