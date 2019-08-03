package org.rk.java.knowledge.rkio;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class SimpleBio {
    static Logger logger = Logger.getLogger(SimpleBio.class.getName());

    private static void test1() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(ClassLoader.getSystemResource("io/text2.txt").getPath());
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8)) {
            outputStreamWriter.append("Hello，world！\n欢迎来到 java 世界\n");
            outputStreamWriter.append("另外一行内容");
            outputStreamWriter.flush();
            logger.info("文件的编码为" + outputStreamWriter.getEncoding());
            fileOutputStream.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream=ClassLoader.getSystemResourceAsStream("");

        test1();
    }

}
