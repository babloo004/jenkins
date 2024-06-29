package com.avinash.jenkins.Service;

import com.avinash.jenkins.Repo.AppRepo;
import com.avinash.jenkins.model.User;
import com.avinash.jenkins.model.UserIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Objects;
import java.util.Optional;

@Service
public class AppService {

    @Autowired
    AppRepo repo;

    public String submitsignup(User user){
        System.out.println(user);
        User returned = repo.save(user);
        if(returned.getUsername()!=null){
            return "Success";
        }
        return "Failed";
    }

    public String submitsignip(UserIn user){
        Optional<User> usr = repo.findById(user.getUsername());
        if(usr.isPresent()){
            User exusr = usr.get();
            if(!Objects.equals(exusr.getPassword(), user.getPassword())){
                return "Wrong Password...!";
            }else{
                return "Welcome "+exusr.getFirstname()+" : )";
            }
        }else{
            return "Not Found ; (";
        }
    }

}
