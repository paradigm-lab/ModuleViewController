package spring.love.calculator.api;

public class WebsiteInfoDTO {
    private String websiteName;
    private String websiteCategory;

    public WebsiteInfoDTO () {
        System.out.println("Inside WebsiteInfoDTO Constructor");
    }

    // Getter and Setter methods
    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getWebsiteCategory() {
        return websiteCategory;
    }

    public void setWebsiteCategory(String websiteCategory) {
        this.websiteCategory = websiteCategory;
    }
}
