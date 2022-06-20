package com.github.aakumykov.argument_utils;

import androidx.annotation.Nullable;

public class ArgumentUtils {

    public static <T> T checkNotNull(T arg) {
        if (null == arg)
            throw new IllegalArgumentException("Argument cannot be null");
        return arg;
    }

    public static void assertBothNullOrNot(@Nullable Object firstArg,
                                           @Nullable Object secondArg)
            throws IllegalArgumentException
    {

        int firstArgNum = (null == firstArg) ? 0 : 1;
        int secondArgNum = (null == secondArg) ? 0 : 1;

        if (1 == (firstArgNum + secondArgNum))
            throw new IllegalArgumentException("Both arguments must be null or not. " +
                    "Now first is : " + ((null == firstArg)?"null":"not null") +
                    ", second is " + ((null == secondArg)?"null":"not null")
            );
    }

}
