package fr.pcsoft.wdjava.core;

/* renamed from: fr.pcsoft.wdjava.core.l */
public class C0727l {
    /* renamed from: a */
    public static final int m3090a(int i, int i2, boolean z) {
        return z ? (1 << i2) | i : ((1 << i2) ^ -1) & i;
    }

    /* renamed from: a */
    public static final boolean m3091a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: b */
    public static final boolean m3092b(int i, int i2) {
        return ((i >> i2) & 1) == 1;
    }
}
