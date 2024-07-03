package com.event.myEvent.dto.request;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrganizerRegisterRequest {
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
}
