package com.sda.spring.demo.service;

import com.sda.spring.demo.dto.UserDTO;
import com.sda.spring.demo.dto.UserPropDTO;
import com.sda.spring.demo.exception.UserNotFoundException;
import com.sda.spring.demo.model.User;
import com.sda.spring.demo.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException(id));
        ModelMapper modelMapper = new ModelMapper();
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);

        return userDTO;
    }

    public List<UserPropDTO> getUserProps() {
        List<User> users = userRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        Type listType = new TypeToken<List<UserPropDTO>>() {}.getType();
        List<UserPropDTO> userPropDTOS = modelMapper.map(users, listType);

        return userPropDTOS;
    }
}


