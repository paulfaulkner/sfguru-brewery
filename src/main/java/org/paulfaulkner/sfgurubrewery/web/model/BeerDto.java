package org.paulfaulkner.sfgurubrewery.web.model;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BeerDto {
    private UUID id;
    private String beerName;
   private String beerDescription;
   private String beerStyle;
   private String beerColor;
   private Long upc;

}
