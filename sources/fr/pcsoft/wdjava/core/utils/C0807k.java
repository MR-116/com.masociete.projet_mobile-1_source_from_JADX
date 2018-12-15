package fr.pcsoft.wdjava.core.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Message;

/* renamed from: fr.pcsoft.wdjava.core.utils.k */
final class C0807k implements OnDismissListener {
    final int[] val$idMessage;

    C0807k(int[] iArr) {
        this.val$idMessage = iArr;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Message.obtain(C0806j.m3954d(), this.val$idMessage[0]).sendToTarget();
    }
}
