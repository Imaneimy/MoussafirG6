package com.DS.DsComupter.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Pc {
    @Id
    @GeneratedValue
    Long id_Pc;
    String proce;
    String ram;
    String hard_Drive;
    Long price;
    String macAddress;
}
