public class Slide {
    private String imagePath;
    private String text;


    public Slide(String imagePath, String text){
        this.imagePath = imagePath;
        this.text = text;
    }

    public String getImagePath(){
        return this.imagePath;
    }

    public String getText(){
        return this.text;
    }
}
