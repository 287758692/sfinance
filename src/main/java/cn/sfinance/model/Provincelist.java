package cn.sfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provincelist")
public class Provincelist implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    /** 省份Id */
    @Column(name = "provinceId")
    private Integer provinceId;

    /** 省份代码 */
    @Column(name = "provinceCode")
    private String provinceCode;

    /** 省份名称 */
    @Column(name = "provinceName")
    private String provinceName;

    /** 新增用户 */
    @Column(name = "crtOptr")
    private Integer crtOptr;

    /** 新增日期 */
    @Column(name = "crtTime")
    private String crtTime;

    /** 修改用户 */
    @Column(name = "modOptr")
    private Integer modOptr;

    /** 修改时间 */
    @Column(name = "modTime")
    private String modTime;



    /**
     * 获取 省份Id 的值
     * @return Integer
     */
    public Integer getProvinceId() {
        return provinceId;
    }
    
    /**
     * 设置省份Id 的值
     * @param Integer provinceId
     */
    public Provincelist setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    /**
     * 获取 省份代码 的值
     * @return String
     */
    public String getProvinceCode() {
        return provinceCode;
    }
    
    /**
     * 设置省份代码 的值
     * @param String provinceCode
     */
    public Provincelist setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    /**
     * 获取 省份名称 的值
     * @return String
     */
    public String getProvinceName() {
        return provinceName;
    }
    
    /**
     * 设置省份名称 的值
     * @param String provinceName
     */
    public Provincelist setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }

    /**
     * 获取 新增用户 的值
     * @return Integer
     */
    public Integer getCrtOptr() {
        return crtOptr;
    }
    
    /**
     * 设置新增用户 的值
     * @param Integer crtOptr
     */
    public Provincelist setCrtOptr(Integer crtOptr) {
        this.crtOptr = crtOptr;
        return this;
    }

    /**
     * 获取 新增日期 的值
     * @return String
     */
    public String getCrtTime() {
        return crtTime;
    }
    
    /**
     * 设置新增日期 的值
     * @param String crtTime
     */
    public Provincelist setCrtTime(String crtTime) {
        this.crtTime = crtTime;
        return this;
    }

    /**
     * 获取 修改用户 的值
     * @return Integer
     */
    public Integer getModOptr() {
        return modOptr;
    }
    
    /**
     * 设置修改用户 的值
     * @param Integer modOptr
     */
    public Provincelist setModOptr(Integer modOptr) {
        this.modOptr = modOptr;
        return this;
    }

    /**
     * 获取 修改时间 的值
     * @return String
     */
    public String getModTime() {
        return modTime;
    }
    
    /**
     * 设置修改时间 的值
     * @param String modTime
     */
    public Provincelist setModTime(String modTime) {
        this.modTime = modTime;
        return this;
    }
}