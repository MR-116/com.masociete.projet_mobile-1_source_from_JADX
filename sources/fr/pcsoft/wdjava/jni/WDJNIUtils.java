package fr.pcsoft.wdjava.jni;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.file.C0884a;
import fr.pcsoft.wdjava.file.C0897o;
import java.io.File;

public class WDJNIUtils {
    public static final String getExternalTempDir() {
        File N = WDAppManager.m2555N();
        return N != null ? N.getPath() : "";
    }

    public static final String getTempDir() {
        File cacheDir = WDAppManager.m2544C().getCacheDir();
        return cacheDir != null ? cacheDir.getPath() : "";
    }

    public static final String getTempDirForFile(String str) {
        if (!C0808l.m4053k(str)) {
            Context C = WDAppManager.m2544C();
            String toLowerCase = str.toLowerCase();
            File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(C, null);
            int i = 0;
            while (i < externalFilesDirs.length) {
                File file = externalFilesDirs[i];
                if (file != null && toLowerCase.startsWith(file.getPath().toLowerCase())) {
                    File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(C);
                    if (i < externalCacheDirs.length && externalCacheDirs[i] != null) {
                        return externalCacheDirs[i].getPath();
                    }
                }
                i++;
            }
        }
        return getTempDir();
    }

    public static final boolean isExternalStoragePath(String str) {
        return C0884a.m6200b(C0897o.m6290j(str));
    }
}
