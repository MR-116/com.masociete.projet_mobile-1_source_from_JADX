package fr.pcsoft.wdjava.database.hf.p049c;

import fr.pcsoft.wdjava.database.hf.WDHF;
import fr.pcsoft.wdjava.jni.WDJNIException;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* renamed from: fr.pcsoft.wdjava.database.hf.c.d */
public class C0843d implements Externalizable {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private int f2253a = 0;
    /* renamed from: b */
    private long f2254b = -1;
    /* renamed from: c */
    private String f2255c;
    /* renamed from: d */
    private int f2256d = 0;

    public C0843d(long j) {
        this.f2254b = j;
    }

    /* renamed from: a */
    public long m5746a() {
        return this.f2254b;
    }

    /* renamed from: a */
    public long m5747a(WDHF wdhf, long j) throws C0841b, WDJNIException {
        this.f2254b = wdhf.mo2945f(j, this.f2255c);
        return this.f2254b;
    }

    /* renamed from: a */
    public void m5748a(int i) {
        this.f2256d = i;
    }

    /* renamed from: a */
    public void m5749a(String str) {
        this.f2255c = str;
    }

    /* renamed from: b */
    public int m5750b() {
        return this.f2253a;
    }

    /* renamed from: b */
    public long m5751b(WDHF wdhf, long j) throws C0841b, WDJNIException {
        try {
            return this.f2254b != -1 ? this.f2254b : m5747a(wdhf, j);
        } catch (C0841b e) {
            throw e;
        }
    }

    /* renamed from: b */
    public void m5752b(int i) {
        this.f2253a = i;
    }

    /* renamed from: c */
    public String m5753c() {
        return this.f2255c;
    }

    /* renamed from: d */
    public int m5754d() {
        return this.f2256d;
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        this.f2255c = objectInput.readUTF();
        this.f2256d = objectInput.readInt();
        this.f2253a = objectInput.readInt();
        this.f2254b = objectInput.readLong();
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f2255c);
        objectOutput.writeInt(this.f2256d);
        objectOutput.writeInt(this.f2253a);
        objectOutput.writeLong(this.f2254b);
    }
}
