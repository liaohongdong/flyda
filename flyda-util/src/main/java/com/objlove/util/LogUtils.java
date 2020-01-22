package com.objlove.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtils {

    public static void info(Class<?> clazz, String msg, Object... obj) {
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.info(msg, obj);
    }

    public static void warn(Class<?> clazz, String msg, Object... obj) {
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.warn(msg, obj);
    }

    public static void debug(Class<?> clazz, String msg, Object... obj) {
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.debug(msg, obj);
    }

    public static void error(Class<?> clazz, String msg, Object... obj) {
        Logger logger = LoggerFactory.getLogger(clazz);
        logger.error(msg, obj);
    }
}
