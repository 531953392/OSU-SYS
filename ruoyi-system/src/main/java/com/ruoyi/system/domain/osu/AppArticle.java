package com.ruoyi.system.domain.osu;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 app_article
 * 
 * @author dxs
 * @date 2021-05-23
 */
public class AppArticle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文章ID */
    private String articleId;

    /** 文章标题 */
    @Excel(name = "文章标题")
    private String articleTitle;

    /** 文章类型 */
    @Excel(name = "文章类型")
    private Long articleTyle;

    /** 文章摘要 */
    @Excel(name = "文章摘要")
    private String articleSummary;

    /** 文章详情链接 */
    @Excel(name = "文章详情链接")
    private String articleUrl;

    /** 文章LOGO */
    @Excel(name = "文章LOGO")
    private String articleLogo;

    /** 状态（0正常 1关闭） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=关闭")
    private String status;

    public void setArticleId(String articleId)
    {
        this.articleId = articleId;
    }

    public String getArticleId()
    {
        return articleId;
    }
    public void setArticleTitle(String articleTitle)
    {
        this.articleTitle = articleTitle;
    }

    public String getArticleTitle() 
    {
        return articleTitle;
    }
    public void setArticleTyle(Long articleTyle) 
    {
        this.articleTyle = articleTyle;
    }

    public Long getArticleTyle() 
    {
        return articleTyle;
    }
    public void setArticleSummary(String articleSummary) 
    {
        this.articleSummary = articleSummary;
    }

    public String getArticleSummary() 
    {
        return articleSummary;
    }
    public void setArticleUrl(String articleUrl) 
    {
        this.articleUrl = articleUrl;
    }

    public String getArticleUrl() 
    {
        return articleUrl;
    }
    public void setArticleLogo(String articleLogo) 
    {
        this.articleLogo = articleLogo;
    }

    public String getArticleLogo() 
    {
        return articleLogo;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("articleId", getArticleId())
            .append("articleTitle", getArticleTitle())
            .append("articleTyle", getArticleTyle())
            .append("articleSummary", getArticleSummary())
            .append("articleUrl", getArticleUrl())
            .append("articleLogo", getArticleLogo())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
