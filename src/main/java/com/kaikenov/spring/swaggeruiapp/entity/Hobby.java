package com.kaikenov.spring.swaggeruiapp.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
@Entity
@Table(name = "hobby")
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hobbyName;

    @ManyToOne
    @JoinColumn(name = "person")
    @JsonIgnore
    private Person person;
}
