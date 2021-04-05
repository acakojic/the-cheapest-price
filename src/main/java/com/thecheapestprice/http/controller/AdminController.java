package com.thecheapestprice.http.controller;

import com.thecheapestprice.dto.AdminDto;
import com.thecheapestprice.http.exceptions.ResourceNotFoundException;
import com.thecheapestprice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


/**
 * Rest Controller for admin.
 */
@RestController
public class AdminController implements AdminApi {

    @Autowired
    private AdminService adminService;


    @Override
    public ResponseEntity<AdminDto> getAdmin() {
        AdminDto view = this.adminService.getAdmin();

        if(view == null) {

            throw new ResourceNotFoundException();
        }

        return ResponseEntity.ok(view);
    }
}
