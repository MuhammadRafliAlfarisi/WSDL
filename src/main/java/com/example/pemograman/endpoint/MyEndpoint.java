package com.example.pemograman.endpoint;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.pemograman.model.User;
import com.example.pemograman.repository.UserRepository;
import com.example.demo.GetAllUserRequest;
import com.example.demo.GetAllUserResponse;
import com.example.demo.MyRequest;
import com.example.demo.MyResponse;


//digenerate jaxb

@Endpoint
public class MyEndpoint {
    
    @Autowired
    private UserRepository userRepository;

    @PayloadRoot(namespace = "http://example.com/demo", localPart = "MyRequest")
    @ResponsePayload
    public MyResponse myMethod(@RequestPayload MyRequest request) {
        MyResponse response = new MyResponse();
        response.setResponseMessage("This is a response to: " + request.getRequestMessage());
        return response;
    } 

    @PayloadRoot(namespace = "http://example.com/demo", localPart = "GetAllStudentRequest")
    @ResponsePayload
    public GetAllUserResponse getAllUserResponse(@RequestPayload GetAllUserRequest request) {
        GetAllUserResponse response = new GetAllUserResponse();
        List<User> user = userRepository.findAll();
        List<com.example.pemograman.model.User> responseUser = new ArrayList<>();
        for (User user2 : user) {
            com.example.pemograman.model.User responseUser2 = new com.example.pemograman.model.User();
            responseUser2.setId(user2.getId());
            responseUser2.setNama(user2.getNama());
            responseUser2.setNpm(user2.getNpm());
            responseUser2.setKelas(user2.getKelas());
            responseUser2.setAsalkota(user2.getAsalkota());
            responseUser.add(responseUser2);
           // System.out.println("Product: " + product.getName());
            
        }
        response.getUser();
        





        return response;
    }
      
}

