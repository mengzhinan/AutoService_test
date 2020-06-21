package com.duke.libb;

import com.duke.libinterface.IBook;
import com.google.auto.service.AutoService;

import org.jetbrains.annotations.Nullable;

/**
 * @Author: duke
 * @DateTime: 2020-06-21 13:53
 * @Description:
 */
@AutoService(IBook.class)
public class BookTCPIPImpl implements IBook {
    @Nullable
    @Override
    public String getBookName() {
        return "book b";
    }
}
