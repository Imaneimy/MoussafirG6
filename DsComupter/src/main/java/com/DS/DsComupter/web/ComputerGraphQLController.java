package com.DS.DsComupter.web;

import com.DS.DsComupter.dto.PcDto;
import com.DS.DsComupter.service.PcService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class ComputerGraphQLController {
    private PcService pcService ;

    @MutationMapping
    public PcDto saveComputer(@Argument PcDto pcDto) {
        return pcService.savePc(pcDto);
    }
    @MutationMapping
    public Boolean deletePc(@Argument Long id){

        return pcService.deletePc(id);
    }


    @QueryMapping
    public List<PcDto> getPcByProce(@Argument String proce) {
        return pcService.getPcByProce(proce);
    }
}
