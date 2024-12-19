package com.DS.DsComupter.service;

import com.DS.DsComupter.dto.PcDto;

import java.util.List;

public interface PcService {
    public PcDto savePc(PcDto pcDto);

    public boolean deletePc(Long id);



    List<PcDto> getPcByProce(String proce);
}