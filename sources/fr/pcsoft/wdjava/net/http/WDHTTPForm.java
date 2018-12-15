package fr.pcsoft.wdjava.net.http;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.file.C0897o;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

public class WDHTTPForm {
    /* renamed from: a */
    private HashMap<String, WDObjet> f2762a = null;
    /* renamed from: b */
    private HashMap<String, C0997v> f2763b = null;

    public final void addFile(String str, File file, String str2) {
        C0997v c0997v = new C0997v(file, str2);
        if (this.f2763b == null) {
            this.f2763b = new HashMap();
        }
        this.f2763b.put(str, c0997v);
    }

    public final void addFile(String str, String str2, String str3) {
        addFile(str, C0897o.m6290j(str2), str3);
    }

    public final void addParam(String str, WDObjet wDObjet) {
        if (this.f2762a == null) {
            this.f2762a = new HashMap();
        }
        this.f2762a.put(str, wDObjet != null ? wDObjet.getClone() : null);
    }

    public final void addParam(String str, String str2) {
        addParam(str, C0611a.m2300a(str2));
    }

    public final void addParam(String str, byte[] bArr) {
        addParam(str, C0611a.m2299a(bArr));
    }

    public final C0997v getFileByName(String str) {
        return this.f2763b != null ? (C0997v) this.f2763b.get(str) : null;
    }

    public final Iterator<String> getFileIterator() {
        return this.f2763b != null ? this.f2763b.keySet().iterator() : null;
    }

    public final int getNbFiles() {
        return this.f2763b != null ? this.f2763b.size() : 0;
    }

    public final int getNbParams() {
        return this.f2762a != null ? this.f2762a.size() : 0;
    }

    public final WDObjet getParamByName(String str) {
        return this.f2762a != null ? (WDObjet) this.f2762a.get(str) : null;
    }

    public final Iterator<String> getParamIterator() {
        return this.f2762a != null ? this.f2762a.keySet().iterator() : null;
    }

    public void release() {
        reset();
    }

    public final void reset() {
        if (this.f2763b != null) {
            this.f2763b.clear();
            this.f2763b = null;
        }
        if (this.f2762a != null) {
            this.f2762a.clear();
            this.f2762a = null;
        }
    }
}
