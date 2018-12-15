package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.jni.WDJNIException;

public class WDHF_Exception extends WDJNIException {
    /* renamed from: b */
    private int f2235b = 0;

    public WDHF_Exception(int i, String str) {
        super(str);
        this.f2235b = i;
    }

    /* renamed from: k */
    public final int m5048k() {
        return this.f2235b;
    }
}
