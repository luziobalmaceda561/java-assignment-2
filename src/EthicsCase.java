/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 350309527
 */
public class EthicsCase {
    private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict; 

    public EthicsCase(String title, String description, String category) {
        this.caseTitle = title;
        this.description = description;
        this.category = category;
        this.verdict = new Verdict();
    }

    public String getCaseTitle()
    { return caseTitle; }
    public String getCaseDescription() { return description; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "Title: " + caseTitle + "\nCategory: " + category + "\nDescription: " + description;
    }

}
