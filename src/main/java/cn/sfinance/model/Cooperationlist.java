package cn.sfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cooperationlist")
public class Cooperationlist implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
    /** 商户Id */
    @Column(name = "cooperationId")
    private Integer cooperationId;

    /** 商户名称 */
    @Column(name = "cooperationName")
    private String cooperationName;

    /** 所属行业代码 */
    @Column(name = "tradeCode")
    private String tradeCode;

    /** 所属省份代码 */
    @Column(name = "provinceCode")
    private String provinceCode;

    /** SR数量 */
    @Column(name = "srobot")
    private String srobot;
    
    /** 微信客户数量 */
    @Column(name = "wechat")
    private String wechat;

    /** 北京微信客户数量 */
    @Column(name = "beijing")
    private String beijing;

    /** 天津微信客户数量 */
    @Column(name = "tianjin")
    private String tianjin;

    /** 上海微信客户数量 */
    @Column(name = "shanghai")
    private String shanghai;

    /** 重庆微信客户数量 */
    @Column(name = "chongqing")
    private String chongqing;

    /** 河北微信客户数量 */
    @Column(name = "hebei")
    private String hebei;

    /** 河南微信客户数量 */
    @Column(name = "henan")
    private String henan;

    /** 云南微信客户数量 */
    @Column(name = "yunnan")
    private String yunnan;

    /** 辽宁微信客户数量 */
    @Column(name = "liaoning")
    private String liaoning;

    /** 黑龙江微信客户数量 */
    @Column(name = "heilongjiang")
    private String heilongjiang;

    /** 湖南微信客户数量 */
    @Column(name = "hunan")
    private String hunan;

    /** 安徽微信客户数量 */
    @Column(name = "anhui")
    private String anhui;

    /** 山东微信客户数量 */
    @Column(name = "shandong")
    private String shandong;

    /** 新疆微信客户数量 */
    @Column(name = "xinjiang")
    private String xinjiang;

    /** 江苏微信客户数量 */
    @Column(name = "jiangsu")
    private String jiangsu;

    /** 浙江微信客户数量 */
    @Column(name = "zhejiang")
    private String zhejiang;

    /** 江西微信客户数量 */
    @Column(name = "jiangxi")
    private String jiangxi;

    /** 湖北微信客户数量 */
    @Column(name = "hubei")
    private String hubei;

    /** 广西微信客户数量 */
    @Column(name = "guangxi")
    private String guangxi;

    /** 甘肃微信客户数量 */
    @Column(name = "gansu")
    private String gansu;

    /** 山西微信客户数量 */
    @Column(name = "sHANXI1")
    private String sHANXI1;

    /** 内蒙古微信客户数量 */
    @Column(name = "neimenggu")
    private String neimenggu;

    /** 陕西微信客户数量 */
    @Column(name = "sHANXI2")
    private String sHANXI2;

    /** 吉林微信客户数量 */
    @Column(name = "jilin")
    private String jilin;

    /** 福建微信客户数量 */
    @Column(name = "fujian")
    private String fujian;

    /** 贵州微信客户数量 */
    @Column(name = "guizhou")
    private String guizhou;

    /** 广东微信客户数量 */
    @Column(name = "guangdong")
    private String guangdong;

    /** 青海微信客户数量 */
    @Column(name = "qinghai")
    private String qinghai;

    /** 西藏微信客户数量 */
    @Column(name = "xizang")
    private String xizang;

    /** 四川微信客户数量 */
    @Column(name = "sichuang")
    private String sichuang;

    /** 宁夏微信客户数量 */
    @Column(name = "ningxia")
    private String ningxia;

    /** 海南微信客户数量 */
    @Column(name = "hainan")
    private String hainan;

    /** 台湾微信客户数量 */
    @Column(name = "taiwan")
    private String taiwan;

    /** 香港微信客户数量 */
    @Column(name = "xianggang")
    private String xianggang;

    /** 澳门微信客户数量 */
    @Column(name = "aomen")
    private String aomen;
    
    /** 图片路径 */
    @Column(name = "picpath")
    private String picpath;
    
    /** 状态 */
    @Column(name = "STATUS")
    private String STATUS;
    
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
     * 获取 商户Id 的值
     * @return Integer
     */
    public Integer getCooperationId() {
        return cooperationId;
    }
    
    /**
     * 设置商户Id 的值
     * @param Integer cooperationId
     */
    public Cooperationlist setCooperationId(Integer cooperationId) {
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
    public Cooperationlist setCooperationName(String cooperationName) {
        this.cooperationName = cooperationName;
        return this;
    }

    /**
     * 获取 所属行业代码 的值
     * @return String
     */
    public String getTradeCode() {
        return tradeCode;
    }
    
    /**
     * 设置所属行业代码 的值
     * @param String tradeCode
     */
    public Cooperationlist setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
        return this;
    }

    /**
     * 获取 所属省份代码 的值
     * @return String
     */
    public String getProvinceCode() {
        return provinceCode;
    }
    
    /**
     * 设置所属省份代码 的值
     * @param String provinceCode
     */
    public Cooperationlist setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    /**
     * 获取 SR数量 的值
     * @return String
     */
    public String getSrobot() {
        return srobot;
    }
    
    /**
     * 设置SR数量 的值
     * @param String srobot
     */
    public Cooperationlist setSrobot(String srobot) {
        this.srobot = srobot;
        return this;
    }
    
    /**
     * 获取 微信客户数量 的值
     * @return String
     */
    public String getWechat() {
        return wechat;
    }
    
    /**
     * 设置微信客户数量 的值
     * @param String wechat
     */
    public Cooperationlist setWechat(String wechat) {
        this.wechat = wechat;
        return this;
    }

    /**
     * 获取 北京微信客户数量 的值
     * @return String
     */
    public String getBeijing() {
        return beijing;
    }
    
    /**
     * 设置北京微信客户数量 的值
     * @param String beijing
     */
    public Cooperationlist setBeijing(String beijing) {
        this.beijing = beijing;
        return this;
    }

    /**
     * 获取 天津微信客户数量 的值
     * @return String
     */
    public String getTianjin() {
        return tianjin;
    }
    
    /**
     * 设置天津微信客户数量 的值
     * @param String tianjin
     */
    public Cooperationlist setTianjin(String tianjin) {
        this.tianjin = tianjin;
        return this;
    }

    /**
     * 获取 上海微信客户数量 的值
     * @return String
     */
    public String getShanghai() {
        return shanghai;
    }
    
    /**
     * 设置上海微信客户数量 的值
     * @param String shanghai
     */
    public Cooperationlist setShanghai(String shanghai) {
        this.shanghai = shanghai;
        return this;
    }

    /**
     * 获取 重庆微信客户数量 的值
     * @return String
     */
    public String getChongqing() {
        return chongqing;
    }
    
    /**
     * 设置重庆微信客户数量 的值
     * @param String chongqing
     */
    public Cooperationlist setChongqing(String chongqing) {
        this.chongqing = chongqing;
        return this;
    }

    /**
     * 获取 河北微信客户数量 的值
     * @return String
     */
    public String getHebei() {
        return hebei;
    }
    
    /**
     * 设置河北微信客户数量 的值
     * @param String hebei
     */
    public Cooperationlist setHebei(String hebei) {
        this.hebei = hebei;
        return this;
    }

    /**
     * 获取 河南微信客户数量 的值
     * @return String
     */
    public String getHenan() {
        return henan;
    }
    
    /**
     * 设置河南微信客户数量 的值
     * @param String henan
     */
    public Cooperationlist setHenan(String henan) {
        this.henan = henan;
        return this;
    }

    /**
     * 获取 云南微信客户数量 的值
     * @return String
     */
    public String getYunnan() {
        return yunnan;
    }
    
    /**
     * 设置云南微信客户数量 的值
     * @param String yunnan
     */
    public Cooperationlist setYunnan(String yunnan) {
        this.yunnan = yunnan;
        return this;
    }

    /**
     * 获取 辽宁微信客户数量 的值
     * @return String
     */
    public String getLiaoning() {
        return liaoning;
    }
    
    /**
     * 设置辽宁微信客户数量 的值
     * @param String liaoning
     */
    public Cooperationlist setLiaoning(String liaoning) {
        this.liaoning = liaoning;
        return this;
    }

    /**
     * 获取 黑龙江微信客户数量 的值
     * @return String
     */
    public String getHeilongjiang() {
        return heilongjiang;
    }
    
    /**
     * 设置黑龙江微信客户数量 的值
     * @param String heilongjiang
     */
    public Cooperationlist setHeilongjiang(String heilongjiang) {
        this.heilongjiang = heilongjiang;
        return this;
    }

    /**
     * 获取 湖南微信客户数量 的值
     * @return String
     */
    public String getHunan() {
        return hunan;
    }
    
    /**
     * 设置湖南微信客户数量 的值
     * @param String hunan
     */
    public Cooperationlist setHunan(String hunan) {
        this.hunan = hunan;
        return this;
    }

    /**
     * 获取 安徽微信客户数量 的值
     * @return String
     */
    public String getAnhui() {
        return anhui;
    }
    
    /**
     * 设置安徽微信客户数量 的值
     * @param String anhui
     */
    public Cooperationlist setAnhui(String anhui) {
        this.anhui = anhui;
        return this;
    }

    /**
     * 获取 山东微信客户数量 的值
     * @return String
     */
    public String getShandong() {
        return shandong;
    }
    
    /**
     * 设置山东微信客户数量 的值
     * @param String shandong
     */
    public Cooperationlist setShandong(String shandong) {
        this.shandong = shandong;
        return this;
    }

    /**
     * 获取 新疆微信客户数量 的值
     * @return String
     */
    public String getXinjiang() {
        return xinjiang;
    }
    
    /**
     * 设置新疆微信客户数量 的值
     * @param String xinjiang
     */
    public Cooperationlist setXinjiang(String xinjiang) {
        this.xinjiang = xinjiang;
        return this;
    }

    /**
     * 获取 江苏微信客户数量 的值
     * @return String
     */
    public String getJiangsu() {
        return jiangsu;
    }
    
    /**
     * 设置江苏微信客户数量 的值
     * @param String jiangsu
     */
    public Cooperationlist setJiangsu(String jiangsu) {
        this.jiangsu = jiangsu;
        return this;
    }

    /**
     * 获取 浙江微信客户数量 的值
     * @return String
     */
    public String getZhejiang() {
        return zhejiang;
    }
    
    /**
     * 设置浙江微信客户数量 的值
     * @param String zhejiang
     */
    public Cooperationlist setZhejiang(String zhejiang) {
        this.zhejiang = zhejiang;
        return this;
    }

    /**
     * 获取 江西微信客户数量 的值
     * @return String
     */
    public String getJiangxi() {
        return jiangxi;
    }
    
    /**
     * 设置江西微信客户数量 的值
     * @param String jiangxi
     */
    public Cooperationlist setJiangxi(String jiangxi) {
        this.jiangxi = jiangxi;
        return this;
    }

    /**
     * 获取 湖北微信客户数量 的值
     * @return String
     */
    public String getHubei() {
        return hubei;
    }
    
    /**
     * 设置湖北微信客户数量 的值
     * @param String hubei
     */
    public Cooperationlist setHubei(String hubei) {
        this.hubei = hubei;
        return this;
    }

    /**
     * 获取 广西微信客户数量 的值
     * @return String
     */
    public String getGuangxi() {
        return guangxi;
    }
    
    /**
     * 设置广西微信客户数量 的值
     * @param String guangxi
     */
    public Cooperationlist setGuangxi(String guangxi) {
        this.guangxi = guangxi;
        return this;
    }

    /**
     * 获取 甘肃微信客户数量 的值
     * @return String
     */
    public String getGansu() {
        return gansu;
    }
    
    /**
     * 设置甘肃微信客户数量 的值
     * @param String gansu
     */
    public Cooperationlist setGansu(String gansu) {
        this.gansu = gansu;
        return this;
    }

    /**
     * 获取 山西微信客户数量 的值
     * @return String
     */
    public String getSHANXI1() {
        return sHANXI1;
    }
    
    /**
     * 设置山西微信客户数量 的值
     * @param String sHANXI1
     */
    public Cooperationlist setSHANXI1(String sHANXI1) {
        this.sHANXI1 = sHANXI1;
        return this;
    }

    /**
     * 获取 内蒙古微信客户数量 的值
     * @return String
     */
    public String getNeimenggu() {
        return neimenggu;
    }
    
    /**
     * 设置内蒙古微信客户数量 的值
     * @param String neimenggu
     */
    public Cooperationlist setNeimenggu(String neimenggu) {
        this.neimenggu = neimenggu;
        return this;
    }

    /**
     * 获取 陕西微信客户数量 的值
     * @return String
     */
    public String getSHANXI2() {
        return sHANXI2;
    }
    
    /**
     * 设置陕西微信客户数量 的值
     * @param String sHANXI2
     */
    public Cooperationlist setSHANXI2(String sHANXI2) {
        this.sHANXI2 = sHANXI2;
        return this;
    }

    /**
     * 获取 吉林微信客户数量 的值
     * @return String
     */
    public String getJilin() {
        return jilin;
    }
    
    /**
     * 设置吉林微信客户数量 的值
     * @param String jilin
     */
    public Cooperationlist setJilin(String jilin) {
        this.jilin = jilin;
        return this;
    }

    /**
     * 获取 福建微信客户数量 的值
     * @return String
     */
    public String getFujian() {
        return fujian;
    }
    
    /**
     * 设置福建微信客户数量 的值
     * @param String fujian
     */
    public Cooperationlist setFujian(String fujian) {
        this.fujian = fujian;
        return this;
    }

    /**
     * 获取 贵州微信客户数量 的值
     * @return String
     */
    public String getGuizhou() {
        return guizhou;
    }
    
    /**
     * 设置贵州微信客户数量 的值
     * @param String guizhou
     */
    public Cooperationlist setGuizhou(String guizhou) {
        this.guizhou = guizhou;
        return this;
    }

    /**
     * 获取 广东微信客户数量 的值
     * @return String
     */
    public String getGuangdong() {
        return guangdong;
    }
    
    /**
     * 设置广东微信客户数量 的值
     * @param String guangdong
     */
    public Cooperationlist setGuangdong(String guangdong) {
        this.guangdong = guangdong;
        return this;
    }

    /**
     * 获取 青海微信客户数量 的值
     * @return String
     */
    public String getQinghai() {
        return qinghai;
    }
    
    /**
     * 设置青海微信客户数量 的值
     * @param String qinghai
     */
    public Cooperationlist setQinghai(String qinghai) {
        this.qinghai = qinghai;
        return this;
    }

    /**
     * 获取 西藏微信客户数量 的值
     * @return String
     */
    public String getXizang() {
        return xizang;
    }
    
    /**
     * 设置西藏微信客户数量 的值
     * @param String xizang
     */
    public Cooperationlist setXizang(String xizang) {
        this.xizang = xizang;
        return this;
    }

    /**
     * 获取 四川微信客户数量 的值
     * @return String
     */
    public String getSichuang() {
        return sichuang;
    }
    
    /**
     * 设置四川微信客户数量 的值
     * @param String sichuang
     */
    public Cooperationlist setSichuang(String sichuang) {
        this.sichuang = sichuang;
        return this;
    }

    /**
     * 获取 宁夏微信客户数量 的值
     * @return String
     */
    public String getNingxia() {
        return ningxia;
    }
    
    /**
     * 设置宁夏微信客户数量 的值
     * @param String ningxia
     */
    public Cooperationlist setNingxia(String ningxia) {
        this.ningxia = ningxia;
        return this;
    }

    /**
     * 获取 海南微信客户数量 的值
     * @return String
     */
    public String getHainan() {
        return hainan;
    }
    
    /**
     * 设置海南微信客户数量 的值
     * @param String hainan
     */
    public Cooperationlist setHainan(String hainan) {
        this.hainan = hainan;
        return this;
    }

    /**
     * 获取 台湾微信客户数量 的值
     * @return String
     */
    public String getTaiwan() {
        return taiwan;
    }
    
    /**
     * 设置台湾微信客户数量 的值
     * @param String taiwan
     */
    public Cooperationlist setTaiwan(String taiwan) {
        this.taiwan = taiwan;
        return this;
    }

    /**
     * 获取 香港微信客户数量 的值
     * @return String
     */
    public String getXianggang() {
        return xianggang;
    }
    
    /**
     * 设置香港微信客户数量 的值
     * @param String xianggang
     */
    public Cooperationlist setXianggang(String xianggang) {
        this.xianggang = xianggang;
        return this;
    }

    /**
     * 获取 澳门微信客户数量 的值
     * @return String
     */
    public String getAomen() {
        return aomen;
    }
    
    /**
     * 设置澳门微信客户数量 的值
     * @param String aomen
     */
    public Cooperationlist setAomen(String aomen) {
        this.aomen = aomen;
        return this;
    }

    /**
     * 获取 图片路径 的值
     * @return String
     */
    public String getPicpath() {
        return picpath;
    }
    
    /**
     * 设置图片路径 的值
     * @param String picpath
     */
    public Cooperationlist setpPicpath(String picpath) {
        this.picpath = picpath;
        return this;
    }
    
    /**
     * 获取 状态 的值
     * @return String
     */
    public String getSTATUS() {
        return STATUS;
    }
    
    /**
     * 设置状态 的值
     * @param String STATUS
     */
    public Cooperationlist setSTATUS(String STATUS) {
        this.STATUS = STATUS;
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
    public Cooperationlist setCrtOptr(Integer crtOptr) {
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
    public Cooperationlist setCrtTime(String crtTime) {
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
    public Cooperationlist setModOptr(Integer modOptr) {
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
    public Cooperationlist setModTime(String modTime) {
        this.modTime = modTime;
        return this;
    }

}