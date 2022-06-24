package main.obiektowka_v1_lombok;

import lombok.*;

// Project Lombok pozwala pisać mniej kodu,
// dzieki operacji 'annotation processing'.
// Lombok sam zgeneruje potrzebne konstruktory i metody.
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class MineralWaterLombok {

    @NonNull
    private String name;
    @NonNull
    private double price;

    private double quantity;
    private double volume;
    private int carbonationLevel;
    private int mineralsLevel;

}
