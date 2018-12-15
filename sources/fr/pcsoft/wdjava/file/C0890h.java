package fr.pcsoft.wdjava.file;

import fr.pcsoft.wdjava.core.utils.C0808l;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* renamed from: fr.pcsoft.wdjava.file.h */
public class C0890h implements FileFilter {
    /* renamed from: a */
    Pattern f2383a;
    /* renamed from: b */
    String f2384b = "";

    public C0890h(String str) {
        this.f2383a = Pattern.compile(C0808l.m4020a(str, true), 34);
    }

    public boolean accept(File file) {
        return file.isDirectory() ? false : this.f2383a.matcher(file.getName()).matches();
    }
}
