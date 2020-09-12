package com.yehong.library.typehandler;

import com.yehong.library.entity.BookType;
import org.apache.ibatis.type.EnumOrdinalTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes(value = BookType.class)
public class BookTypeHandler extends EnumOrdinalTypeHandler<BookType> {
    public BookTypeHandler(Class<BookType> type) {
        super(type);
    }
}
