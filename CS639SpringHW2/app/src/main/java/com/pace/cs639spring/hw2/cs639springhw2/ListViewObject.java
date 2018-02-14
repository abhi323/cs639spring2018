package com.pace.cs639spring.hw2.cs639springhw2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhishek on 2/11/2018.
 */

public class ListViewObject {
    int mImage;
    List<String> mNames;
    String name;
    boolean isSelected;
    int position;

    ListViewObject(int image, List names) {
        mImage = image;
        mNames=names;
    }
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }


}
