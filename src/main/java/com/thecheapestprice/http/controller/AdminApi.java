package com.thecheapestprice.http.controller;

import com.thecheapestprice.dto.AdminDto;
import com.thecheapestprice.dto.RestError;
import com.thecheapestprice.util.ApiResponseCodeMessages;
import com.thecheapestprice.util.AppControllerRoutes;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Api(value = "admin", description = "the admin API")
@RequestMapping(value = AppControllerRoutes.ADMIN)
public interface AdminApi {

    @ApiOperation(value = "Get Admin",
            nickname = "admin",
            notes = "Get admin",
            response = AdminDto.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = ApiResponseCodeMessages.CODE_200, response = AdminDto.class),
            @ApiResponse(code = 403, message = ApiResponseCodeMessages.CODE_403, response = RestError.class),
            @ApiResponse(code = 500, message = ApiResponseCodeMessages.CODE_500, response = RestError.class) })
    @RequestMapping(value = "",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<AdminDto> getAdmin();

}
