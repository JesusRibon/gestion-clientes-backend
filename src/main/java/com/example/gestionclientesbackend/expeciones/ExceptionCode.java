package com.example.gestionclientesbackend.expeciones;

import lombok.Getter;

@Getter
public enum ExceptionCode {
  PRODUCT_NOT_FOUND("PNF-001", "NOT_FOUND");

  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }
}
