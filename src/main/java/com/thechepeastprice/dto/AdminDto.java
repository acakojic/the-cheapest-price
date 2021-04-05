package com.thechepeastprice.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Base data transfer object for admin model which groups its id, username, password, and version.
 */
@Data
@ApiModel(description = "Admin request and response object.")
public class AdminDto {

    private long id;
    private String username;
    private String password;
}
