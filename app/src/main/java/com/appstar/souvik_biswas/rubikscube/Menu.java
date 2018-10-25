package com.appstar.souvik_biswas.rubikscube;

public class Menu {

    private String mStage;
    private String mName;
    private int mImageResourceId;
    private int mColorResourceId;

    /**
     * constructor
     * @param stage input stage
     * @param name input stage name
     * @param imageResourceId input image id
     * @param colorResourceId input color id
     */
    public Menu(String stage, String name, int imageResourceId, int colorResourceId) {
        mStage = stage;
        mName = name;
        mImageResourceId = imageResourceId;
        mColorResourceId = colorResourceId;
    }

    /**
     * @return Stage number
     */
    public String getStage() {
        return mStage;
    }

    /**
     * @return Stage name
     */
    public String getName() {
        return mName;
    }

    /**
     * @return Image id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return Color id
     */
    public int getColorResourceId() {
        return mColorResourceId;
    }
}
