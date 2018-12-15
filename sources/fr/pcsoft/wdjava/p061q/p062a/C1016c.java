package fr.pcsoft.wdjava.p061q.p062a;

import android.content.Context;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import java.io.File;

/* renamed from: fr.pcsoft.wdjava.q.a.c */
public class C1016c extends C1015b {
    /* renamed from: a */
    public File mo3282a(Context context) {
        return context.getExternalCacheDir();
    }

    /* renamed from: a */
    public void mo3283a(MediaRecorder mediaRecorder, boolean z) {
        mediaRecorder.setProfile(CamcorderProfile.get(z ? 0 : 1));
    }

    /* renamed from: a */
    public void mo3284a(WebSettings webSettings, boolean z) {
        webSettings.setPluginState(z ? PluginState.ON : PluginState.OFF);
    }
}
