package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by gaoshan on 15-8-28.
 */
public class ClassLoaderUtils {

    private static final Logger logger = LoggerFactory.getLogger(ClassLoaderUtils.class);
    private static final Properties EMPTY_PROPERTIES = new Properties();

    private static ClassLoader classLoader;

    /**
     * 获得资源真实文件路径
     *
     * @param resource
     *            资源
     * @return
     */
    public static String getPath(String resource) {
        return getURL(resource).getPath();
    }

    public static URL getURL(String resource) {
        return getClassLoader().getResource(resource);
    }

    /**
     * 创建指定类的实例
     *
     * @param clazzName
     *            类名
     * @return
     */
    public static Object getInstance(String clazzName) {
        try {
            return loadClass(clazzName).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据指定的类名加载类
     *
     * @param name
     *            类名
     * @return
     */
    public static Class<?> loadClass(String name) {
        try {
            return getClassLoader().loadClass(name);

        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ClassLoader getClassLoader() {
        if (classLoader != null) {
            return classLoader;
        }
        classLoader = Thread.currentThread().getContextClassLoader();
        return classLoader;

    }

    /**
     * 将资源文件加载到输入流中
     *
     * @param resource
     *            资源文件
     * @return
     */
    public static InputStream getStream(String resource) {
        return getClassLoader().getResourceAsStream(resource);
    }

    public static InputStream getStreamNoJvmCache(String resource) {
        try {
            return getClassLoader().getResource(resource).openStream();
        } catch (IOException ex) {
            logger.error("", ex);
        }
        return null;
    }

    /**
     * 将资源文件转化为Properties对象
     *
     * @param resource
     *            资源文件
     * @return
     */
    public static Properties getProperties(String resource) {
        Properties properties = new Properties();
        try {
            InputStream is = getStream(resource);
            if (is == null)
                return EMPTY_PROPERTIES;
            properties.load(is);
            return properties;
        } catch (IOException ex) {
            return EMPTY_PROPERTIES;
        }
    }

    /**
     * 将资源文件转化为Reader
     *
     * @param resource
     *            资源文件
     * @return
     */
    public static Reader getReader(String resource) {
        InputStream is = getStream(resource);
        if (is == null) {
            return null;
        }
        return new BufferedReader(new InputStreamReader(is));
    }

    /**
     * 将资源文件的内容转化为List实例
     *
     * @param resource
     *            资源文件
     * @return
     */
    public static List<String> getList(String resource) {
        List<String> list = new ArrayList<String>();
        BufferedReader reader = (BufferedReader) getReader(resource);
        if (null == reader) {
            return list;
        }
        String line = "";
        try {
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException ex) {
            logger.error("将资源文件转化为list出现异常", ex);
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException ex) {
                    logger.warn(ex.getMessage());
                }
        }
        return list;
    }
}
