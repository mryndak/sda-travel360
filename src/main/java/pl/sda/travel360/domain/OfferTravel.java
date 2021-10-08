package pl.sda.travel360.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class OfferTravel {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Country country;

    @Column(length = 5000)
    private String description;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @OneToOne(fetch = FetchType.EAGER)
    private Travel travel;
}
