package com.springboot.manager.common.serialize;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 14:25 2018/2/9
 */
public class DateToLongSerialize extends JsonSerializer<Date> {

    // 将时间转成long类型  在UserDto中被使用
    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        gen.writeNumber(value.getTime() / 1000);
    }
}
