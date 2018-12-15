package fr.pcsoft.wdjava.widget.ui;

import android.widget.RemoteViews;
import fr.pcsoft.wdjava.ui.champs.nb;

public interface IWDChampWidget extends nb {
    Class getClasseWidgetProvider();

    RemoteViews getRemoteViews();

    int getViewId();
}
