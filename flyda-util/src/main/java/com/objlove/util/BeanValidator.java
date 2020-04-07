package com.objlove.util;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.objlove.util.dto.JsonData;
import org.apache.commons.collections.MapUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.*;

public class BeanValidator {

    private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    public static <T> Map<String, String> validate(T t, Class... clzs) {
        Validator validator = factory.getValidator();
        Set validateResult = validator.validate(t, clzs);
        if (validateResult.isEmpty()) {
            return Collections.emptyMap();
        } else {
            LinkedHashMap errors = Maps.newLinkedHashMap();
            Iterator iterator = validateResult.iterator();
            while (iterator.hasNext()) {
                ConstraintViolation violation = (ConstraintViolation) iterator.next();
                errors.put(violation.getPropertyPath().toString(), violation.getMessage());
            }
            return errors;
        }
    }

    public static Map<String, String> validateList(Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        Iterator iterator = collection.iterator();
        Map errors = null;
        do {
            if (!iterator.hasNext()) {
                return Collections.emptyMap();
            }
        } while (errors.isEmpty());
        return errors;
    }

    public static Map<String, String> validateObject(Object first, Object... o) {
        if (o != null && o.length > 0) {
            return validateList(Lists.asList(first, o));
        } else {
            return validate(first, new Class[0]);
        }
    }

    //  throws ParamException
    public static JsonData check(Object o) {
        Map<String, String> map = BeanValidator.validateObject(o);
        if (MapUtils.isNotEmpty(map)) {
            return JsonData.build(map, "参数错误", 20001);
        } else {
            return null;
        }
    }
}
