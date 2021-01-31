import java.util.*;


class ResistorColor {
    private String[] colors_ = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    private Map<String, Integer> colormap_;

    ResistorColor(){
        colormap_ = new HashMap<String, Integer>();

        for(int i = 0; i < colors_.length; i++){
            colormap_.put(colors_[i], i);
        }
    }

    int colorCode(String color) {
        return colormap_.get(color);
    }

    String[] colors() {
        return colors_;
    }
}
