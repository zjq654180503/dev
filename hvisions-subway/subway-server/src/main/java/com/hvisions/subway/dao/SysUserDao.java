package com.hvisions.subway.dao;

import com.hvisions.subway.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserDao extends JpaRepository<SysUser, Long>
{
}
