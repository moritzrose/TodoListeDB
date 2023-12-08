package com.example.letztesprojektgingnicht.Controller;

public class TodosResponseDTO {
    private String message;

    public TodosResponseDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
