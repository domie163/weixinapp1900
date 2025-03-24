package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 课程
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kecheng")
public class KechengView extends KechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 课程类型的值
	*/
	@ColumnInfo(comment="课程类型的字典表值",type="varchar(200)")
	private String kechengValue;

	//级联表 教师
		/**
		* 教师名称
		*/

		@ColumnInfo(comment="教师名称",type="varchar(200)")
		private String jiaoshiName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(255)")
		private String jiaoshiPhoto;
		/**
		* 教师手机号
		*/

		@ColumnInfo(comment="教师手机号",type="varchar(200)")
		private String jiaoshiPhone;
		/**
		* 教师身份证号
		*/

		@ColumnInfo(comment="教师身份证号",type="varchar(200)")
		private String jiaoshiIdNumber;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String jiaoshiEmail;
		/**
		* 假删
		*/

		@ColumnInfo(comment="假删",type="int(11)")
		private Integer jiaoshiDelete;



	public KechengView() {

	}

	public KechengView(KechengEntity kechengEntity) {
		try {
			BeanUtils.copyProperties(this, kechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 课程类型的值
	*/
	public String getKechengValue() {
		return kechengValue;
	}
	/**
	* 设置： 课程类型的值
	*/
	public void setKechengValue(String kechengValue) {
		this.kechengValue = kechengValue;
	}


	//级联表的get和set 教师

		/**
		* 获取： 教师名称
		*/
		public String getJiaoshiName() {
			return jiaoshiName;
		}
		/**
		* 设置： 教师名称
		*/
		public void setJiaoshiName(String jiaoshiName) {
			this.jiaoshiName = jiaoshiName;
		}

		/**
		* 获取： 头像
		*/
		public String getJiaoshiPhoto() {
			return jiaoshiPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setJiaoshiPhoto(String jiaoshiPhoto) {
			this.jiaoshiPhoto = jiaoshiPhoto;
		}

		/**
		* 获取： 教师手机号
		*/
		public String getJiaoshiPhone() {
			return jiaoshiPhone;
		}
		/**
		* 设置： 教师手机号
		*/
		public void setJiaoshiPhone(String jiaoshiPhone) {
			this.jiaoshiPhone = jiaoshiPhone;
		}

		/**
		* 获取： 教师身份证号
		*/
		public String getJiaoshiIdNumber() {
			return jiaoshiIdNumber;
		}
		/**
		* 设置： 教师身份证号
		*/
		public void setJiaoshiIdNumber(String jiaoshiIdNumber) {
			this.jiaoshiIdNumber = jiaoshiIdNumber;
		}

		/**
		* 获取： 邮箱
		*/
		public String getJiaoshiEmail() {
			return jiaoshiEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setJiaoshiEmail(String jiaoshiEmail) {
			this.jiaoshiEmail = jiaoshiEmail;
		}

		/**
		* 获取： 假删
		*/
		public Integer getJiaoshiDelete() {
			return jiaoshiDelete;
		}
		/**
		* 设置： 假删
		*/
		public void setJiaoshiDelete(Integer jiaoshiDelete) {
			this.jiaoshiDelete = jiaoshiDelete;
		}


	@Override
	public String toString() {
		return "KechengView{" +
			", kechengValue=" + kechengValue +
			", jiaoshiName=" + jiaoshiName +
			", jiaoshiPhoto=" + jiaoshiPhoto +
			", jiaoshiPhone=" + jiaoshiPhone +
			", jiaoshiIdNumber=" + jiaoshiIdNumber +
			", jiaoshiEmail=" + jiaoshiEmail +
			", jiaoshiDelete=" + jiaoshiDelete +
			"} " + super.toString();
	}
}
