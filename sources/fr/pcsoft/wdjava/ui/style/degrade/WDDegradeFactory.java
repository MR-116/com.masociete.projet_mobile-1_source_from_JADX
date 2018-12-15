package fr.pcsoft.wdjava.ui.style.degrade;

import fr.pcsoft.wdjava.ui.p064a.C1031a;

public class WDDegradeFactory {
    /* renamed from: a */
    public static final IWDDegrade m10395a(int[] iArr, int i, float[] fArr) {
        return new C1499a(iArr, i, fArr);
    }

    public static final IWDDegrade creerDegrade_GEN(int[] iArr, int i, int[] iArr2) {
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr3[i2] = C1031a.m7467k(iArr[i2]);
        }
        return m10395a(iArr3, i, null);
    }
}
