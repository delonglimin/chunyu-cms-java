package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.BasicLanguage;

/**
 * 基础数据-语言管理Mapper接口
 *
 * @author ruoyi
 * @date 2023-10-13
 */
public interface BasicLanguageMapper
{
    /**
     * 查询基础数据-语言管理
     *
     * @param id 基础数据-语言管理主键
     * @return 基础数据-语言管理
     */
    public BasicLanguage selectBasicLanguageById(Long id);

    /**
     * 查询基础数据-语言管理列表
     *
     * @param basicLanguage 基础数据-语言管理
     * @return 基础数据-语言管理集合
     */
    public List<BasicLanguage> selectBasicLanguageList(BasicLanguage basicLanguage);

    /**
     * 新增基础数据-语言管理
     *
     * @param basicLanguage 基础数据-语言管理
     * @return 结果
     */
    public int insertBasicLanguage(BasicLanguage basicLanguage);

    /**
     * 修改基础数据-语言管理
     *
     * @param basicLanguage 基础数据-语言管理
     * @return 结果
     */
    public int updateBasicLanguage(BasicLanguage basicLanguage);

    /**
     * 删除基础数据-语言管理
     *
     * @param id 基础数据-语言管理主键
     * @return 结果
     */
    public int deleteBasicLanguageById(Long id);

    /**
     * 批量删除基础数据-语言管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBasicLanguageByIds(Long[] ids);
}
