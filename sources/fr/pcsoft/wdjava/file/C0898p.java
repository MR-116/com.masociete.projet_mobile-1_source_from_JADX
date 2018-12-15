package fr.pcsoft.wdjava.file;

import fr.pcsoft.wdjava.core.utils.C0808l;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: fr.pcsoft.wdjava.file.p */
public class C0898p implements FilenameFilter {
    /* renamed from: a */
    Pattern f2417a;
    /* renamed from: b */
    String f2418b = "";

    public C0898p(String str) {
        this.f2417a = Pattern.compile(C0808l.m4020a(str, true), 34);
    }

    public boolean accept(File file, String str) {
        return this.f2417a.matcher(str).matches();
    }
}
