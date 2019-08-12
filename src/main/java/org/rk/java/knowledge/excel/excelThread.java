package org.rk.java.knowledge.excel;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author rongkai
 * @date 2019/8/8 16:09
 */
public class excelThread {
    public static void main(String[] args) {
        Log log = LogFactory.get();
        List<List<String>> rows = null;
        List<String>[] rowsArr = new ArrayList[100000];
        for (int i = 0; i < 100000; i++) {
            List<String> row1 = CollUtil.newArrayList("aa" + i, "bb", "cc" + i, "dd");
            rowsArr[i] = row1;
        }
        rows = CollUtil.newArrayList(rowsArr);
        //通过工具类创建writer
        ExcelWriter writer = ExcelUtil.getBigWriter();
        //合并单元格后的标题行，使用默认标题样式
        writer.merge(3, "测试标题");
        //一次性写出内容，强制输出标题
        long start = System.currentTimeMillis();
        log.info("开始生成excel");
        try {
            writer.write(rows, true);
            writer.flush();
        } catch (Exception e) {
            log.error(e);
        }

        log.info("生成成功,耗时:" + (System.currentTimeMillis() - start));
        //关闭writer，释放内存
        writer.close();

    }
}
