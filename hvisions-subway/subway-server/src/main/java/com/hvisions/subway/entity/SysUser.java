package com.hvisions.subway.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * 系统用户
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BaseEntity{

	/**
	 * 用户id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	/**
	 * 用户名
	 */
	@Column(unique =true)
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 姓名
	 */
	private String fullName;
	/**
	 * 岗位
	 */
	private String post;
	/**
	 * 手机号
	 */
	private Integer phone;
	/**
	 * 电话
	 */
	private String telephone;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 头像链接
	 */
	private String headImgUrl;
	/**
	 * 性别
	 */
	private Character sex;
	/**
	 * 状态
	 */
	private String status;

	@ManyToMany(fetch= FetchType.EAGER)//立即从数据库中进行加载数据;
	@JoinTable(name = "SysUserRole", joinColumns = {@JoinColumn(name = "userId")}, inverseJoinColumns ={@JoinColumn(name = "roleId") })
	private List<SysRole> roleList;
}
