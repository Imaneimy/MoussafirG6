package com.DS.DsComupter.mapper;

import com.DS.DsComupter.dao.entities.Pc;
import com.DS.DsComupter.dto.PcDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Pc fromPcDtoToPc(PcDto pcDto){
        return mapper.map(pcDto, Pc.class);
    }

    public PcDto fromAvionToAvionDto(Pc avion){
        return mapper.map(avion, PcDto.class);
    }

}