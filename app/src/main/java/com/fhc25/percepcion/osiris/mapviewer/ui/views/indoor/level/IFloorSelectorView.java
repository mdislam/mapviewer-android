package com.fhc25.percepcion.osiris.mapviewer.ui.views.indoor.level;

import java.util.Collection;

/**
 * Created by alvaroarranz on 11/09/15.
 */
public interface IFloorSelectorView {

    void addObserver(IFloorSelectorObserver observer);

    void removeObserver(IFloorSelectorObserver observer);

    boolean isVisible();

    void setVisible(boolean visible);

    void setFloor(String floor);

    String getFloor();

    public void load(Collection<String> names);
}