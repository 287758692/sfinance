package cn.sfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tradelist")
public class Tradelist implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    /** 行业Id */
    @Column(name = "tradeId")
    private Integer tradeId;

    /** 行业代码 */
    @Column(name = "tradeCode")
    private String tradeCode;

    /** 行业名称 */
    @Column(name = "tradeName")
    private String tradeName;

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
     * 获取 行业Id 的值
     * @return Integer
     */
    public Integer getTradeId() {
        return tradeId;
    }
    
    /**
     * 设置行业Id 的值
     * @param Integer tradeId
     */
    public Tradelist setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * 获取 行业代码 的值
     * @return String
     */
    public String getTradeCode() {
        return tradeCode;
    }
    
    /**
     * 设置行业代码 的值
     * @param String tradeCode
     */
    public Tradelist setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
        return this;
    }

    /**
     * 获取 行业名称 的值
     * @return String
     */
    public String getTradeName() {
        return tradeName;
    }
    
    /**
     * 设置行业名称 的值
     * @param String tradeName
     */
    public Tradelist setTradeName(String tradeName) {
        this.tradeName = tradeName;
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
    public Tradelist setCrtOptr(Integer crtOptr) {
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
    public Tradelist setCrtTime(String crtTime) {
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
    public Tradelist setModOptr(Integer modOptr) {
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
    public Tradelist setModTime(String modTime) {
        this.modTime = modTime;
        return this;
    }
}