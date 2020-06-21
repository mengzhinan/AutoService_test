package com.duke.liba;

import com.duke.libinterface.IBook;
import com.google.auto.service.AutoService;

import org.jetbrains.annotations.Nullable;

/**
 * @Author: duke
 * @DateTime: 2020-06-21 13:54
 * @Description:
 */
@AutoService(IBook.class)
public class BookPythonImpl implements IBook {

    @Nullable
    @Override
    public String getBookName() {
        return "book a";
    }

}
