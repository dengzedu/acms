package com.czswho.acms.acms.model;

import java.util.Date;

public class article {
    private int articleId;
    private String columnName; //从column取
    private column column;
    private Date createTime;
    private int sortNumber;
    private String root_in;
    private String appendix;
    private int hits;
    private String author;
    private String title;
    private String content;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public com.czswho.acms.acms.model.column getColumn() {
        return column;
    }

    public void setColumn(com.czswho.acms.acms.model.column column) {
        this.column = column;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(int sortNumber) {
        this.sortNumber = sortNumber;
    }

    public String getRoot_in() {
        return root_in;
    }

    public void setRoot_in(String root_in) {
        this.root_in = root_in;
    }

    public String getAppendix() {
        return appendix;
    }

    public void setAppendix(String appendix) {
        this.appendix = appendix;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
