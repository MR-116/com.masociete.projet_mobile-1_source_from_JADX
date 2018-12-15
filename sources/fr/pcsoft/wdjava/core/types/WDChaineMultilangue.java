package fr.pcsoft.wdjava.core.types;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.C0536n;

public class WDChaineMultilangue {
    public static int getInt(int... iArr) {
        int a = C0725i.m3011a(C0536n.getIndiceLangueCourante());
        return (a < 0 || a >= iArr.length) ? iArr.length > 0 ? iArr[0] : 0 : iArr[a];
    }

    public static String getString(String... strArr) {
        int a = C0725i.m3011a(C0536n.getIndiceLangueCourante());
        return (a < 0 || a >= strArr.length) ? strArr.length > 0 ? strArr[0] : "" : strArr[a];
    }
}
