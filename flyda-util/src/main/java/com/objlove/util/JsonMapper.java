package com.objlove.util;


import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;
import org.codehaus.jackson.type.TypeReference;

public class JsonMapper {

    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setFilters(new SimpleFilterProvider().setFailOnUnknownId(false));
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);
    }

    public static <T> String objToString(T src) {
        if (src == null) {
            return null;
        }
        try {
            if (src instanceof String) {
                return (String) src;
            } else {
                return mapper.writeValueAsString(src);
            }
        } catch (Exception e) {
            LogUtils.error(JsonMapper.class, "parse object to string exception, error:{}", e);
            return null;
        }
    }

    public static <T> T stringToObj(String src, TypeReference<T> type) {
        if (src == null || type == null) {
            return null;
        }
        try {
            return (T) (type.getType().equals(String.class) ? src : mapper.readValue(src, type));
        } catch (Exception e) {
            LogUtils.error(JsonMapper.class, "parse string to object exception, string:{}, TypeReference<T>:{}, error:{}", src, type, e);
            return null;
        }
    }
}
