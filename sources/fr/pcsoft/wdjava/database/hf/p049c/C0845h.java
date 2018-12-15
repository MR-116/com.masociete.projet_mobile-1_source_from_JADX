package fr.pcsoft.wdjava.database.hf.p049c;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* renamed from: fr.pcsoft.wdjava.database.hf.c.h */
public class C0845h implements Externalizable {
    private static final long serialVersionUID = 8603198793102410886L;
    /* renamed from: a */
    private transient boolean f2259a = false;
    /* renamed from: b */
    private transient Object[] f2260b;
    /* renamed from: c */
    private transient boolean f2261c = false;
    /* renamed from: d */
    private transient boolean f2262d = false;

    /* renamed from: a */
    public final void m5759a(boolean z) {
        this.f2261c = z;
    }

    /* renamed from: a */
    public final void m5760a(Object[] objArr) {
        this.f2260b = objArr;
    }

    /* renamed from: a */
    public final boolean m5761a() {
        return this.f2262d;
    }

    /* renamed from: b */
    public final void m5762b(boolean z) {
        this.f2259a = z;
    }

    /* renamed from: b */
    public final boolean m5763b() {
        return this.f2259a;
    }

    /* renamed from: c */
    public final void m5764c(boolean z) {
        this.f2262d = z;
    }

    /* renamed from: c */
    public final Object[] m5765c() {
        return this.f2260b;
    }

    /* renamed from: d */
    public final boolean m5766d() {
        return this.f2261c;
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        int readInt = objectInput.readInt();
        if (readInt >= 0) {
            this.f2260b = new Object[readInt];
            int i = 0;
            while (i < readInt) {
                try {
                    this.f2260b[i] = objectInput.readObject();
                    i++;
                } catch (IOException e) {
                    throw e;
                }
            }
        }
        this.f2260b = null;
        this.f2259a = objectInput.readBoolean();
        this.f2262d = objectInput.readBoolean();
        this.f2261c = objectInput.readBoolean();
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int i = -1;
        if (this.f2260b != null) {
            i = this.f2260b.length;
        }
        objectOutput.writeInt(i);
        if (this.f2260b != null) {
            int i2 = 0;
            while (i2 < i) {
                try {
                    objectOutput.writeObject(this.f2260b[i2]);
                    i2++;
                } catch (IOException e) {
                    throw e;
                }
            }
        }
        objectOutput.writeBoolean(this.f2259a);
        objectOutput.writeBoolean(this.f2262d);
        objectOutput.writeBoolean(this.f2261c);
        objectOutput.flush();
    }
}
