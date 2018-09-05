package cn.sfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detailreport")
public class Detailreport implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    /** Id */
    @Column(name = "detailId")
    private Integer detailId;

    /** 商户ID */
    @Column(name = "cooperationId")
    private String cooperationId;

    /** 商户名称 */
    @Column(name = "cooperationName")
    private String cooperationName;

    /** 统计项类型 */
    @Column(name = "rPType")
    private String rPType;

    /** 统计项顺序 */
    @Column(name = "rPSeq")
    private Integer rPSeq;

    /** 统计项名称 */
    @Column(name = "rPName")
    private String rPName;

    /** 统计项值 */
    @Column(name = "rpdata")
    private String rpdata;

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
     * 获取 Id 的值
     * @return Integer
     */
    public Integer getDetailId() {
        return detailId;
    }
    
    /**
     * 设置Id 的值
     * @param Integer detailId
     */
    public Detailreport setDetailId(Integer detailId) {
        this.detailId = detailId;
        return this;
    }

    /**
     * 获取 商户ID 的值
     * @return String
     */
    public String getCooperationId() {
        return cooperationId;
    }
    
    /**
     * 设置商户ID 的值
     * @param String cooperationId
     */
    public Detailreport setCooperationId(String cooperationId) {
        this.cooperationId = cooperationId;
        return this;
    }

    /**
     * 获取 商户名称 的值
     * @return String
     */
    public String getCooperationName() {
        return cooperationName;
    }
    
    /**
     * 设置商户名称 的值
     * @param String cooperationName
     */
    public Detailreport setCooperationName(String cooperationName) {
        this.cooperationName = cooperationName;
        return this;
    }

    /**
     * 获取 统计项类型 的值
     * @return String
     */
    public String getRPType() {
        return rPType;
    }
    
    /**
     * 设置统计项类型 的值
     * @param String rPType
     */
    public Detailreport setRPType(String rPType) {
        this.rPType = rPType;
        return this;
    }

    /**
     * 获取 统计项顺序 的值
     * @return Integer
     */
    public Integer getRPSeq() {
        return rPSeq;
    }
    
    /**
     * 设置统计项顺序 的值
     * @param Integer rPSeq
     */
    public Detailreport setRPSeq(Integer rPSeq) {
        this.rPSeq = rPSeq;
        return this;
    }

    /**
     * 获取 统计项名称 的值
     * @return String
     */
    public String getRPName() {
        return rPName;
    }
    
    /**
     * 设置统计项名称 的值
     * @param String rPName
     */
    public Detailreport setRPName(String rPName) {
        this.rPName = rPName;
        return this;
    }

    /**
     * 获取 统计项值 的值
     * @return String
     */
    public String getRpdata() {
        return rpdata;
    }
    
    /**
     * 设置统计项值 的值
     * @param String rpdata
     */
    public Detailreport setRpdata(String rpdata) {
        this.rpdata = rpdata;
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
    public Detailreport setCrtOptr(Integer crtOptr) {
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
    public Detailreport setCrtTime(String crtTime) {
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
    public Detailreport setModOptr(Integer modOptr) {
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
    public Detailreport setModTime(String modTime) {
        this.modTime = modTime;
        return this;
    }
}