package com.thechepeastprice.http.controller;

import com.thechepeastprice.dto.AdminDto;
import com.thechepeastprice.http.exceptions.ResourceNotFoundException;
import com.thechepeastprice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


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
