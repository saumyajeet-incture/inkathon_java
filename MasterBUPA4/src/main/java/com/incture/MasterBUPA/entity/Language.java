
package com.incture.MasterBUPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ASHU
 *
 */
@Entity
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lang_id;
	@Column(unique =true,nullable = false,length =3 )
	private String l_code;
	@Column(unique =true,nullable = false)
	private String l_name;
	/**
	 * @return the lang_id
	 */
	public Integer getLang_id() {
		return lang_id;
	}
	/**
	 * @param lang_id the lang_id to set
	 */
	public void setLang_id(Integer lang_id) {
		this.lang_id = lang_id;
	}
	/**
	 * @return the l_code
	 */
	public String getL_code() {
		return l_code;
	}
	/**
	 * @param l_code the l_code to set
	 */
	public void setL_code(String l_code) {
		this.l_code = l_code;
	}
	/**
	 * @return the l_name
	 */
	public String getL_name() {
		return l_name;
	}
	/**
	 * @param l_name the l_name to set
	 */
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	@Override
	public String toString() {
		return "Language [lang_id=" + lang_id + ", l_code=" + l_code + ", l_name=" + l_name + "]";
	}
}
	
