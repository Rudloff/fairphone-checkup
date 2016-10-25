package com.fairphone.checkup.Module;

import android.content.Context;

import com.fairphone.checkup.tests.Test;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dirk on 20-10-15.
 */
public interface Module extends Serializable {
    int getPictureResourceID();

    int getDescriptionId();

    int getModuleNameID();

    List<Test> getTestList(Context context);
}