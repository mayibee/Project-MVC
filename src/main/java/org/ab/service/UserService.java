package org.ab.service;

import org.ab.dto.UserDTO;

public interface UserService extends CrudService<UserDTO, String>{
    //Dont need the methods anymore as they all come from CrudService
//    //save
//    UserDTO save(UserDTO user);
//    //search user by username
//    UserDTO findById(Long id);
//    UserDTO findByUsername(String username);
//    //retrieve all users in list
//    List<UserDTO> findAll();
//    //delete
//    void delete(UserDTO user);
//    void deleteByUsername(String username);
//    void deleteById(Long id);
}
