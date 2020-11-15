
package BTVN_Buoi7.B3;

import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    
    public News(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.printf("%15d %15s %15s %15s %15s %15f ",id,title,publishDate,author,content,averageRate);
        System.out.println();
    }
    private int[] rateList = new int[3];
    public void InputRateList(){
        Scanner sc= new Scanner(System.in);
        for(int i =0;i<3;i++){
            System.out.print("Rate["+ (i+1)+"] = ");
            rateList[i] = sc.nextInt();
        }
    }
    public void Calculate(){
        this.averageRate = (float)((rateList[0]+rateList[1]+rateList[2])*1.0/3);
    }
}
