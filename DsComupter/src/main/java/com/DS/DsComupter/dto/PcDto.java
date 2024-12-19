package com.DS.DsComupter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PcDto {
    String proce;
    String ram;
    String hard_Drive;
    Long price;
}
