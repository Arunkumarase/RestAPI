package com.myfirstproject.RestAPI;

import com.myfirstproject.RestAPI.Model.User;
import com.myfirstproject.RestAPI.Model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value="/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value="/users")
    public List<User> getUser(@RequestParam (name = "sortby",required = false) String sortby){

        List<User> result = new ArrayList<User>();
        System.out.println(userRepo.findAll());
        result = userRepo.findAll();
        if (sortby != null && sortby.equals("occupation")){
            Collections.sort(result,new User.OccupationComparator());
        } else if (sortby != null && sortby.equals("salary")){
            Collections.sort(result,new User.SalaryComparator());
        }
        else {
            Collections.sort(result);
        }
        return result;
    }
    @PostMapping(value="/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "saved";
    }
    @PutMapping(value="/update/{id}")
    public String updateUser(@PathVariable Long id ,@RequestBody User user){
        User updateUser = userRepo.findById(id).get();

        updateUser.setFirstName(user.getFirstName());
        updateUser.setLastName(user.getLastName());
        updateUser.setOccupation(user.getOccupation());
        updateUser.setSalary(user.getSalary());
        userRepo.save(updateUser);
        return "updated";
    }
    @DeleteMapping(value="/delete/{id}")
    public String deleteUser(@PathVariable Long id,@RequestBody User user){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "User id " + id + " deleted";
    }

}
