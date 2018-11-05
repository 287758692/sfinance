package cn.sfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cooperationlink")
public class Cooperationlink implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    /** ID */
    @Column(name = "id")
    private Integer id;

    /** 名称 */
    @Column(name = "name")
    private String name;

    /** 城市 */
    @Column(name = "provinceCode")
    private String provinceCode;

    /** 等级 */
    @Column(name = "level")
    private Integer level;

    /** 序号 */
    @Column(name = "seq")
    private Integer seq;

    /** 上级 */
    @Column(name = "parent")
    private Integer parent;

    /** 链接 */
    @Column(name = "link")
    private String link;

    /** 二维码 */
    @Column(name = "qRcode")
    private String qRcode;

    /** 状态 */
    @Column(name = "status")
    private String status;

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
     * 获取 ID 的值
     * @return Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID 的值
     * @param /Integer id
     */
    public Cooperationlink setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 获取 名称 的值
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称 的值
     * @param /String name
     */
    public Cooperationlink setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取 城市 的值
     * @return String
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置城市 的值
     * @param /String provinceCode
     */
    public Cooperationlink setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    /**
     * 获取 等级 的值
     * @return Integer
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置等级 的值
     * @param /Integer level
     */
    public Cooperationlink setLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 获取 序号 的值
     * @return Integer
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置序号 的值
     * @param /Integer seq
     */
    public Cooperationlink setSeq(Integer seq) {
        this.seq = seq;
        return this;
    }

    /**
     * 获取 上级 的值
     * @return Integer
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * 设置上级 的值
     * @param /Integer parent
     */
    public Cooperationlink setParent(Integer parent) {
        this.parent = parent;
        return this;
    }

    /**
     * 获取 链接 的值
     * @return String
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置链接 的值
     * @param /String link
     */
    public Cooperationlink setLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 获取 二维码 的值
     * @return String
     */
    public String getQRcode() {
        return qRcode;
    }

    /**
     * 设置二维码 的值
     * @param /String qRcode
     */
    public Cooperationlink setQRcode(String qRcode) {
        this.qRcode = qRcode;
        return this;
    }

    /**
     * 获取 状态 的值
     * @return String
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 的值
     * @param /String status
     */
    public Cooperationlink setStatus(String status) {
        this.status = status;
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
     * @param /Integer crtOptr
     */
    public Cooperationlink setCrtOptr(Integer crtOptr) {
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
     * @param /String crtTime
     */
    public Cooperationlink setCrtTime(String crtTime) {
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
     * @param /Integer modOptr
     */
    public Cooperationlink setModOptr(Integer modOptr) {
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
     * @param /String modTime
     */
    public Cooperationlink setModTime(String modTime) {
        this.modTime = modTime;
        return this;
    }

}