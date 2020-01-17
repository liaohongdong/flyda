package com.objlove.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author Hongdong Liao`
 * @since 2020-01-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ScrapyBookWhole extends BaseEntity {


    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 书籍对应章节
     */
    private Integer cid;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 书籍链接
     */
    private String bookUrl;

    /**
     * 封面图片
     */
    private String bookImg;

    /**
     * 类别
     */
    private String bookType;

    /**
     * 大分类
     */
    private String classifyOne;

    /**
     * 小分类
     */
    private String classifyTwo;

    /**
     * 字数
     */
    private String fontNum;

    /**
     * 书籍状态 0 完结 1 连载
     */
    private String bookStatus;

    /**
     * 作者
     */
    private String authorName;

    /**
     * 简介
     */
    private String intro;

    /**
     * 最新章节
     */
    private String lastChapter;

    /**
     * 最新更新时间
     */
    private String lastTime;

}
