package com.thecheapestprice.service;

import com.thecheapestprice.dto.AdminDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * Implementation of AdminService.
 */
@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private static final Logger LOG = LoggerFactory.getLogger(AdminServiceImpl.class);


    @Override
    public AdminDto getAdmin() {
        LOG.debug("Getting admin: {}");

        AdminDto adminDto = new AdminDto();
        adminDto.setId(2);
        adminDto.setUsername("admin02");
        adminDto.setPassword("admin123");

        return adminDto;
    }
}
