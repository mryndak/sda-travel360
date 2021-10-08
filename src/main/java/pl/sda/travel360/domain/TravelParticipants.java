package pl.sda.travel360.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class TravelParticipants {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    @ManyToOne
    private User relatedToUser;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Travel> travels;
}
