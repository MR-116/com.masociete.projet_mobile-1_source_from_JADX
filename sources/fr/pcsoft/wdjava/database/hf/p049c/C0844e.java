package fr.pcsoft.wdjava.database.hf.p049c;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* renamed from: fr.pcsoft.wdjava.database.hf.c.e */
public class C0844e extends C0843d {
    /* renamed from: e */
    private String f2257e = "";
    /* renamed from: f */
    private String f2258f = "";

    public C0844e(long j) {
        super(j);
    }

    /* renamed from: b */
    public void m5755b(String str) {
        this.f2258f = str;
    }

    /* renamed from: c */
    public final void m5756c(String str) {
        this.f2257e = str;
    }

    /* renamed from: e */
    public final String m5757e() {
        return this.f2257e;
    }

    /* renamed from: f */
    public String m5758f() {
        return this.f2258f;
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        super.readExternal(objectInput);
        this.f2258f = objectInput.readUTF();
        this.f2257e = objectInput.readUTF();
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        super.writeExternal(objectOutput);
        objectOutput.writeUTF(this.f2258f);
        objectOutput.writeUTF(this.f2257e);
    }
}
