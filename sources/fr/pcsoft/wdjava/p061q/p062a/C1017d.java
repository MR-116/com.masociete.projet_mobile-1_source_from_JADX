package fr.pcsoft.wdjava.p061q.p062a;

import android.content.pm.ApplicationInfo;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.p035c.C0665g;

/* renamed from: fr.pcsoft.wdjava.q.a.d */
public class C1017d extends C1016c {
    /* renamed from: c */
    public String mo3285c() throws C0665g {
        ApplicationInfo applicationInfo = WDAppManager.m2544C().getApplicationInfo();
        if (applicationInfo == null) {
            return "";
        }
        try {
            return applicationInfo.nativeLibraryDir;
        } catch (C0665g e) {
            throw e;
        }
    }
}
