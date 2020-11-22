package com.hbh.base.business.jwt.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hbh.base.business.sysUser.entity.SysUser;
import com.hbh.base.business.sysUser.service.SysUserService;
import com.hbh.base.jwt.JwtUtil;
import com.hbh.base.utils.ResponseEntity;
import com.hbh.base.utils.ResponseEnum;
import com.hbh.base.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class JwtController {
    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value = "/getToken",method = RequestMethod.POST)
    public ResponseEntity getToken(@RequestParam("userAccount") String userAccount,@RequestParam("password")String password){
        SysUser user = new SysUser();
        user.setAccount(userAccount);
        user.setPassword(password);
        user.setDel(false);
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>(user);
        user = sysUserService.getOne(queryWrapper);
        if(user==null){
            return ResponseUtil.fail(ResponseEnum.ERROE_403);
        }
        String token = JwtUtil.createToken(user);
        return ResponseUtil.success(token);
    }
}
