package fr.dawan.damarchand_backend.bourse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BourseDto {
    private long id;
    private int version;
    private Double taux;
}
