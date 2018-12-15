package fr.pcsoft.wdjava.core.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class vb {
    /* renamed from: a */
    public static char f2171a = '\u0000';
    /* renamed from: b */
    public static char f2172b = '\u0000';

    static {
        m4154a();
    }

    /* renamed from: a */
    private static void m4154a() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormat().getDecimalFormatSymbols();
        f2172b = decimalFormatSymbols.getGroupingSeparator();
        if (f2172b == ' ') {
            f2172b = ' ';
        }
        f2171a = decimalFormatSymbols.getDecimalSeparator();
    }
}
