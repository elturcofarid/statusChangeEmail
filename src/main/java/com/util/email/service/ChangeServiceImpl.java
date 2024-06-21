package com.util.email.service;

import org.springframework.stereotype.Service;

@Service
public class ChangeServiceImpl implements ChangeService{


    @Override
    public Object changeStatus(String prueba) {
        return prueba;
    }
}
