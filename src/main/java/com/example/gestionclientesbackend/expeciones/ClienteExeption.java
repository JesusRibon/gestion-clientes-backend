package com.example.gestionclientesbackend.expeciones;

import org.springframework.http.HttpStatus;

public class ClienteExeption extends BaseException{
public ClienteExeption(String message){
  super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.PRODUCT_NOT_FOUND);
}
}
