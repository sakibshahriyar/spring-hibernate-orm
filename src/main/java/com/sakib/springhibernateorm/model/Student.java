package com.sakib.springhibernateorm.model;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Column(length = 100, nullable = false)
    private String name;

    @Email
    @NotEmpty
    @Column(length = 100, nullable = false)
    private String email;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Past
    @Column(nullable = false)
    private Date dateOfBirth;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @NotBlank
    @Column(length = 10, nullable = false)
    private String quota = "N/A";

    @NotBlank
    @Column(length = 100, nullable = false)
    private String country = "Bangladeshi";

    // getters and setters
}
