package 设计模式原则.单一职责;

public interface IScreenDisplay {
    /**
     * display image on screen
     *
     * @param image
     */
    void displayImage(String image);

    /**
     * display a text on screen
     *
     * @param text
     */
    void displayText(String text);

    /**
     * display a video on screen
     *
     * @param video
     */
    void displayVideo(String video);
}
