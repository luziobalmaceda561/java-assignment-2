/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 350309527
 */
public class Verdict {
private String caseName;
private String studentVerdict;
private String reason;

// Empty constructor required by UML
public Verdict() {
this.caseName = "";
this.studentVerdict = "";
this.reason = "";
}

public Verdict(String caseName, String studentVerdict, String reason) {
this.caseName = caseName;
this.studentVerdict = studentVerdict;
this.reason = reason;
}

// Getters and Setters
public String getCaseName() { return caseName; }
public void setCaseName(String name) { this.caseName = name; }
public String getStudentVerdict() { return studentVerdict; }
public void setStudentVerdict(String verdict) { this.studentVerdict = verdict; }
public String getReason() { return reason; }
public void setReason(String reason) { this.reason = reason; }

@Override
public String toString() {
return "Verdict: " + studentVerdict + " | Reason: " + reason;
}
}

