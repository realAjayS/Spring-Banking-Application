package com.ajay.banking.dto;

public record AccountDto(Long id,
                         String accountHolderName,
                         double balance) {}
