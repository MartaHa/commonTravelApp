package pl.coderslab.entity;

import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Ride {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotBlank
        private String placeA;
        @NotBlank
        private String placeB;
        @NotBlank
        private String date;
        @NotBlank
        private String time;

        private int freeSeats;

        private String luggage;
         private String animals;
        private String price;


        @ManyToOne
        private User user;
       @ManyToMany
       private List<User> users;


    }
