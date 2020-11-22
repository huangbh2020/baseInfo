package com.hbh.base.business.jwt.service.impl;

import com.hbh.base.business.jwt.entity.SysUser;
import com.hbh.base.business.jwt.mapping.SysUserMapper;
import com.hbh.base.business.jwt.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户管理 服务实现类
 * </p>
 *
 * @author huanghb
 * @since 2020-11-22
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
