package com.mabo.testblanktwo;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Main {


    public @Nullable
    int[] decryptData(@NonNull int[] price,
                      @IntRange(from = 1, to = 99) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {
        if (price == null) {
            return null;
        }

        int[] arrayOfNewPrices = new int[readLength];
        float discountInPercent = (float) discount / 100;

        for (int i = offset, j = 0; i < offset + readLength; i++, j++) {
            arrayOfNewPrices[j] = (int) (price[i] * discountInPercent);
        }

        return arrayOfNewPrices;
    }
}