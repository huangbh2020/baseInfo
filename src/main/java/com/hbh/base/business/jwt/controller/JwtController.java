package com.hbh.base.business.jwt.controller;

import com.hbh.base.utils.ResponseEntity;
import com.hbh.base.utils.ResponseUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JwtController {

    public ResponseEntity getToken(){
        return ResponseUtil.success("");
    }

}
