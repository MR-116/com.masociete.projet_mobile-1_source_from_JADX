package fr.pcsoft.wdjava.media;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.core.utils.jc;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.file.C0897o;
import java.io.File;
import java.io.IOException;

class fb extends ic {
    /* renamed from: z */
    private static final String[] f2597z = new String[]{m6843z(m6844z("\u00017L\u001cP;3^\u001fFh>YS@:³Y\u0001\u0003$?\u001c\u0015J+2U\u0016Qh.Y\u001eS'(]\u001aQ-t")), m6843z(m6844z("'/H\u0003V<")), m6843z(m6844z(")4X\u0001L!>\u0012\u001eF,3]]B+.U\u001cMf\fu7f\u0007\u00052s\u001c\u000fn6")), m6843z(m6844z("!7[")), m6843z(m6844z(")4X\u0001L!>\u0012\u001eF,3]]B+.U\u001cMf\u0013q2d\r\u00052s\u001c\u000fn6"))};
    final C0957s this$0;
    final Activity val$activiteEnCours;
    final WDCallback val$callback;
    final long val$lDateCourante;
    final int val$nTypeCapture;

    fb(C0957s c0957s, WDCallback wDCallback, int i, Activity activity, long j) {
        this.this$0 = c0957s;
        this.val$callback = wDCallback;
        this.val$nTypeCapture = i;
        this.val$activiteEnCours = activity;
        this.val$lDateCourante = j;
    }

    static void access$300(fb fbVar, Object obj) {
        fbVar.m1787a(obj);
    }

    /* renamed from: z */
    private static String m6843z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 72;
                    break;
                case 1:
                    i2 = 90;
                    break;
                case 2:
                    i2 = 60;
                    break;
                case 3:
                    i2 = 115;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6844z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 35);
        }
        return toCharArray;
    }

    /* renamed from: c */
    protected void mo2434c() {
        File d;
        Exception e;
        String str = null;
        try {
            Intent intent = new Intent(this.val$nTypeCapture == 2 ? f2597z[4] : f2597z[2]);
            try {
                Parcelable parcelable;
                if ((kb.m3985o() == 1 ? 1 : 0) == 0) {
                    parcelable = null;
                } else {
                    try {
                        parcelable = this.val$activiteEnCours.getContentResolver().insert(this.val$nTypeCapture == 2 ? Media.EXTERNAL_CONTENT_URI : Video.Media.EXTERNAL_CONTENT_URI, new ContentValues());
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
                if (kb.m3966a(jc.COOLPIX_S800C)) {
                    try {
                        d = C0897o.m6271d(f2597z[3], "");
                        try {
                            intent.putExtra(f2597z[1], Uri.fromFile(d));
                        } catch (IOException e3) {
                            e = e3;
                            C0691a.m2857a(f2597z[0], e);
                            if (d != null) {
                                try {
                                    str = d.getPath();
                                } catch (IOException e22) {
                                    throw e22;
                                }
                            }
                            this.val$activiteEnCours.registerReceiver(new C0954p(this, parcelable, str), new IntentFilter(this.val$nTypeCapture == 2 ? f2597z[2] : f2597z[4]));
                            this.val$activiteEnCours.startActivityForResult(intent, this.val$nTypeCapture == 2 ? 4098 : 4097);
                        }
                    } catch (IOException e4) {
                        e = e4;
                        d = null;
                        C0691a.m2857a(f2597z[0], e);
                        if (d != null) {
                            str = d.getPath();
                        }
                        if (this.val$nTypeCapture == 2) {
                        }
                        this.val$activiteEnCours.registerReceiver(new C0954p(this, parcelable, str), new IntentFilter(this.val$nTypeCapture == 2 ? f2597z[2] : f2597z[4]));
                        if (this.val$nTypeCapture == 2) {
                        }
                        this.val$activiteEnCours.startActivityForResult(intent, this.val$nTypeCapture == 2 ? 4098 : 4097);
                    }
                }
                intent.putExtra(f2597z[1], parcelable);
                d = null;
                if (d != null) {
                    str = d.getPath();
                }
                try {
                    if (this.val$nTypeCapture == 2) {
                    }
                    this.val$activiteEnCours.registerReceiver(new C0954p(this, parcelable, str), new IntentFilter(this.val$nTypeCapture == 2 ? f2597z[2] : f2597z[4]));
                    if (this.val$nTypeCapture == 2) {
                    }
                    this.val$activiteEnCours.startActivityForResult(intent, this.val$nTypeCapture == 2 ? 4098 : 4097);
                } catch (IOException e222) {
                    throw e222;
                }
            } catch (IOException e2222) {
                throw e2222;
            }
        } catch (IOException e22222) {
            throw e22222;
        }
    }

    /* renamed from: h */
    protected void mo3228h() {
        super.mo3228h();
        if (this.val$callback != null) {
            Object d = m1792d();
            WDCallback wDCallback = this.val$callback;
            WDObjet[] wDObjetArr = new WDObjet[1];
            wDObjetArr[0] = C0611a.m2300a(d != null ? d.toString() : "");
            wDCallback.execute(wDObjetArr);
        }
    }
}
